package com.example.cat.Service;

import com.example.cat.DTO.DiseaseDTO;
import com.example.cat.Entity.DiseaseEntity;
import com.example.cat.Exception.DiseaseNotFoundException;
import com.example.cat.Mapper.DiseaseMapper;
import com.example.cat.Repository.DiseaseRepository;
import com.example.cat.Response.CreateResponse;
import com.example.cat.Response.DeleteResponse;
import com.example.cat.Response.FindResponse;
import com.example.cat.Response.UpdateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiseaseServiceImpl implements DiseaseService {
    private final DiseaseRepository diseaseRepository;
    private final DiseaseMapper diseaseMapper;

    @Override
    public CreateResponse<DiseaseDTO> createDisease(DiseaseDTO diseaseDTO) {
        DiseaseDTO dto = diseaseMapper.toDTO(diseaseRepository.save(diseaseMapper.toEntity(diseaseDTO)));
        return new CreateResponse<DiseaseDTO>(dto, "Disease successfully created");
    }

    @Override
    public FindResponse<DiseaseDTO> findById(Long id) throws DiseaseNotFoundException {
        DiseaseDTO dto = diseaseMapper.toDTO(diseaseRepository.findById(id).orElseThrow(() -> new DiseaseNotFoundException("Disease not found", 404, id)));
        return new FindResponse<>(dto, "Disease found successfully");
    }

    @Override
    public UpdateResponse<DiseaseDTO> updateDisease(DiseaseDTO diseaseDTO) throws DiseaseNotFoundException {
        DiseaseEntity diseaseEntity = diseaseRepository.findById(diseaseDTO.getId()).orElseThrow(() -> new DiseaseNotFoundException("Disease not found", 404, diseaseDTO.getId()));
        diseaseEntity = diseaseMapper.toEntity(diseaseDTO);
        return new UpdateResponse<>(diseaseMapper.toDTO(diseaseEntity), "Update successfully");
    }

    @Override
    public DeleteResponse deleteDiseaseById(Long id) {
        diseaseRepository.deleteById(id);
        return new DeleteResponse("Delete successfully");
    }
}

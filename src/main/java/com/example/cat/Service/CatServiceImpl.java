package com.example.cat.Service;

import com.example.cat.DTO.CatDTO;
import com.example.cat.Entity.CatEntity;
import com.example.cat.Exception.CatNotFoundException;
import com.example.cat.Mapper.CatMapper;
import com.example.cat.Repository.CatRepository;
import com.example.cat.Response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService {
    private final CatRepository catRepository;
    private final CatMapper catMapper;

    @Override
    public CreateResponse<CatDTO> createCat(CatDTO catDTO) {
        CatDTO dto = catMapper.toDto(catRepository.save(catMapper.toEntity(catDTO)));
        return new CreateResponse<CatDTO>(dto, "Cat created successfully");
    }

    @Override
    public FindResponse<CatDTO> findCatById(Long id) throws CatNotFoundException {
        CatDTO catDTO = catMapper.toDto(catRepository.findById(id).orElseThrow(() -> new CatNotFoundException("Cat not found", 404, id)));
        return new FindResponse<CatDTO>(catDTO, "Cat successfully found");
    }

    @Override
    public FindResponse<CatDTO> findCatByName(String name) throws CatNotFoundException {
        CatDTO catDTO = catMapper.toDto(catRepository.findByName(name).orElseThrow(() -> new CatNotFoundException("Cat not found", 404, null)));
        return new FindResponse<CatDTO>(catDTO, "Cat successfully found");
    }

    @Override
    public FindManyResponse<CatDTO> findIllnessCats() {
        return new FindManyResponse<CatDTO>(catMapper.toDtoList(catRepository.findCatEntitiesByDiseaseNull()), "Successfully found");
    }

    @Override
    public UpdateResponse<CatDTO> updateCat(CatDTO catDTO) throws CatNotFoundException {
        CatEntity catEntity = catRepository.findById(catDTO.getId()).orElseThrow(() -> new CatNotFoundException("Cat not found", 404, catDTO.getId()));
        catEntity = catMapper.toEntity(catDTO);
        catRepository.save(catEntity);
        return new UpdateResponse<CatDTO>(catDTO, "Cat successfully updated");
    }

    @Override
    public DeleteResponse deleteCat(Long id) {
        catRepository.deleteById(id);
        return new DeleteResponse("Cat successfully deleted");
    }
}

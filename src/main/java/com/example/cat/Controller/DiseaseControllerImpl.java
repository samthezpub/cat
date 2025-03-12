package com.example.cat.Controller;

import com.example.cat.DTO.DiseaseDTO;
import com.example.cat.Exception.DiseaseNotFoundException;
import com.example.cat.Response.CreateResponse;
import com.example.cat.Response.DeleteResponse;
import com.example.cat.Response.FindResponse;
import com.example.cat.Response.UpdateResponse;
import com.example.cat.Service.DiseaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DiseaseControllerImpl implements DiseaseController {
    private final DiseaseServiceImpl diseaseService;

    @Override
    public CreateResponse<DiseaseDTO> create(DiseaseDTO diseaseDTO) {
        return diseaseService.createDisease(diseaseDTO);
    }

    @Override
    public FindResponse<DiseaseDTO> findById(Long id) throws DiseaseNotFoundException {
        return diseaseService.findById(id);
    }

    @Override
    public UpdateResponse<DiseaseDTO> update(DiseaseDTO diseaseDTO) throws DiseaseNotFoundException {
        return diseaseService.updateDisease(diseaseDTO);
    }

    @Override
    public DeleteResponse delete(Long id) {
        return diseaseService.deleteDiseaseById(id);
    }
}

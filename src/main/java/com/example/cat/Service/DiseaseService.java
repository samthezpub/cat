package com.example.cat.Service;

import com.example.cat.DTO.DiseaseDTO;
import com.example.cat.Exception.DiseaseNotFoundException;
import com.example.cat.Response.CreateResponse;
import com.example.cat.Response.DeleteResponse;
import com.example.cat.Response.FindResponse;
import com.example.cat.Response.UpdateResponse;

public interface DiseaseService {
    CreateResponse<DiseaseDTO> createDisease(DiseaseDTO diseaseDTO);
    FindResponse<DiseaseDTO> findById(Long id) throws DiseaseNotFoundException;
    UpdateResponse<DiseaseDTO> updateDisease(DiseaseDTO diseaseDTO) throws DiseaseNotFoundException;
    DeleteResponse deleteDiseaseById(Long id);
}

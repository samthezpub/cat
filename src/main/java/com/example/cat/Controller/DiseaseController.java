package com.example.cat.Controller;

import com.example.cat.DTO.DiseaseDTO;
import com.example.cat.Exception.DiseaseNotFoundException;
import com.example.cat.Response.CreateResponse;
import com.example.cat.Response.DeleteResponse;
import com.example.cat.Response.FindResponse;
import com.example.cat.Response.UpdateResponse;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/disease")
public interface DiseaseController {
    @PostMapping("/create")
    CreateResponse<DiseaseDTO> create(@RequestBody DiseaseDTO diseaseDTO);

    @GetMapping("/find/{id}")
    FindResponse<DiseaseDTO> findById(@PathVariable("id") Long id) throws DiseaseNotFoundException;

    @PostMapping("/update")
    UpdateResponse<DiseaseDTO> update(@RequestBody DiseaseDTO diseaseDTO) throws DiseaseNotFoundException;

    @DeleteMapping("/delete/{id}")
    DeleteResponse delete(@PathVariable("id") Long id);
}



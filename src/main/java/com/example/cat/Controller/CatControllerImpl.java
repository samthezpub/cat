package com.example.cat.Controller;

import com.example.cat.DTO.CatDTO;
import com.example.cat.Exception.CatNotFoundException;
import com.example.cat.Response.*;
import com.example.cat.Service.CatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CatControllerImpl implements CatController {
    private final CatServiceImpl catService;

    @Override
    public CreateResponse<CatDTO> createCat(CatDTO catDTO) {
        return catService.createCat(catDTO);
    }

    @Override
    public FindResponse<CatDTO> findCatById(Long id) throws CatNotFoundException {
        return catService.findCatById(id);
    }

    @Override
    public FindResponse<CatDTO> findCatByName(String name) throws CatNotFoundException {
        return catService.findCatByName(name);
    }

    @Override
    public FindManyResponse<CatDTO> findCatIllness() {
        return catService.findIllnessCats();
    }

    @Override
    public UpdateResponse<CatDTO> updateCat(CatDTO catDTO) throws CatNotFoundException {
        return catService.updateCat(catDTO);
    }

    @Override
    public DeleteResponse deleteCat(Long id) {
        return catService.deleteCat(id);
    }
}



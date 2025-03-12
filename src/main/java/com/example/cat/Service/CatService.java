package com.example.cat.Service;

import com.example.cat.DTO.CatDTO;
import com.example.cat.Exception.CatNotFoundException;
import com.example.cat.Response.*;

public interface CatService {
    CreateResponse<CatDTO> createCat(CatDTO catDTO);
    FindResponse<CatDTO> findCatById(Long id) throws CatNotFoundException;
    FindResponse<CatDTO> findCatByName(String name) throws CatNotFoundException;
    FindManyResponse<CatDTO> findIllnessCats();
    UpdateResponse<CatDTO> updateCat(CatDTO catDTO) throws CatNotFoundException;
    DeleteResponse deleteCat(Long id);
}

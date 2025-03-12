package com.example.cat.Service;

import com.example.cat.DTO.CatDTO;
import com.example.cat.Entity.CatEntity;
import com.example.cat.Exception.CatNotFoundException;
import com.example.cat.Mapper.UniversalMapper;
import com.example.cat.Repository.CatRepository;
import com.example.cat.Response.CreateResponse;
import com.example.cat.Response.DeleteResponse;
import com.example.cat.Response.FindResponse;
import com.example.cat.Response.UpdateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService {
    private final CatRepository catRepository;
    private final UniversalMapper<CatEntity, CatDTO> universalMapper;

    @Override
    public CreateResponse<CatDTO> createCat(CatDTO catDTO) {
        catRepository.save(universalMapper.toEntity(catDTO));
        return new CreateResponse<CatDTO>(catDTO, "Cat created successfully");
    }

    @Override
    public FindResponse<CatDTO> findCatById(Long id) throws CatNotFoundException {
        catRepository.findById(id).orElseThrow(() -> new CatNotFoundException("Cat not found", 404, id));
        return null;
    }

    @Override
    public FindResponse<CatDTO> findCatByName(String name) {
        return null;
    }

    @Override
    public UpdateResponse<CatDTO> updateCat(CatDTO catDTO) {
        return null;
    }

    @Override
    public DeleteResponse deleteCat(Long id) {
        return null;
    }
}

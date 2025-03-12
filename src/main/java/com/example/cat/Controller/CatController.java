package com.example.cat.Controller;

import com.example.cat.DTO.CatDTO;
import com.example.cat.Exception.CatNotFoundException;
import com.example.cat.Response.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cat")
public interface CatController {
    @PostMapping("/create")
    CreateResponse<CatDTO> createCat(@RequestBody CatDTO catDTO);

    @GetMapping("/find/{id}")
    FindResponse<CatDTO> findCatById(@PathVariable("id") Long id) throws CatNotFoundException;

    @GetMapping("/findByName/{name}")
    FindResponse<CatDTO> findCatByName(@PathVariable("name") String name) throws CatNotFoundException;

    @GetMapping("/findIllness")
    FindManyResponse<CatDTO> findCatIllness() throws CatNotFoundException;

    @PostMapping("/update")
    UpdateResponse<CatDTO> updateCat(@RequestBody CatDTO catDTO) throws CatNotFoundException;

    @DeleteMapping("/delete/{id}")
    DeleteResponse deleteCat(@PathVariable("id") Long id);
}

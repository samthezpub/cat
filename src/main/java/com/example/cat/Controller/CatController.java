package com.example.cat.Controller;

import com.example.cat.DTO.CatDTO;
import com.example.cat.Exception.CatNotFoundException;
import com.example.cat.Response.CreateResponse;
import com.example.cat.Response.DeleteResponse;
import com.example.cat.Response.FindResponse;
import com.example.cat.Response.UpdateResponse;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cat")
public interface CatController {
    @PostMapping("/create")
    CreateResponse<CatDTO> createCat(@RequestBody CatDTO catDTO);

    @GetMapping("/find/{id}")
    FindResponse<CatDTO> findCatById(@PathVariable Long id) throws CatNotFoundException;

    @GetMapping("/findByName/{name}")
    FindResponse<CatDTO> findCatByName(@PathVariable String name) throws CatNotFoundException;

    @PostMapping("/update")
    UpdateResponse<CatDTO> updateCat(@RequestBody CatDTO catDTO) throws CatNotFoundException;

    @DeleteMapping("/delete/{id}")
    DeleteResponse deleteCat(@PathVariable Long id);
}

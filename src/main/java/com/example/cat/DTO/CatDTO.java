package com.example.cat.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatDTO {
    private Long id;
    private Integer age;
    private String name;
    private DiseaseDTO diseaseDTO;
}

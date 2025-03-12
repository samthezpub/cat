package com.example.cat.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiseaseNotFoundException extends NotFoundException {
    public DiseaseNotFoundException(String message, Integer code, Long id) {
        super(message, code, id);
    }
}

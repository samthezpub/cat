package com.example.cat.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends Exception {
    private Integer code;
    private Long id;

    public NotFoundException(String message, Integer code, Long id) {
        super(message);
    }
}
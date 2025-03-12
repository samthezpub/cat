package com.example.cat.Exception;

public class CatNotFoundException extends NotFoundException {
    public CatNotFoundException(String message, Integer code, Long id) {
        super(message, code, id);
    }
}

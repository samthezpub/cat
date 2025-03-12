package com.example.cat.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class FindManyResponse<T> {
    private List<T> dto;
    private String message;
}

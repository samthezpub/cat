package com.example.cat.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UpdateResponse<T> {
    private T dto;
    private String message;
}

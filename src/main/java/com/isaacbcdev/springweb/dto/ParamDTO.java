package com.isaacbcdev.springweb.dto;

import lombok.Data;

@Data
public class ParamDTO {

    private String message;

    public ParamDTO(String message) {
        this.message = message;
    }

}
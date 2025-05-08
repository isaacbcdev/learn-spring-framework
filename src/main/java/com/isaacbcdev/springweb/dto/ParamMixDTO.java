package com.isaacbcdev.springweb.dto;

import lombok.Data;

@Data
public class ParamMixDTO {

    private String message;
    private Integer code;

    public ParamMixDTO() {
    }

    public ParamMixDTO(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

}
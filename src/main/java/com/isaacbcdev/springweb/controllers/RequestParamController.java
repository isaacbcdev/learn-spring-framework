package com.isaacbcdev.springweb.controllers;

import com.isaacbcdev.springweb.dto.ParamDTO;
import com.isaacbcdev.springweb.dto.ParamMixDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-params")
public class RequestParamController {

    @GetMapping("/greet")
    public ParamDTO greet(@RequestParam(required = false, defaultValue = "Hola") String message) {
        ParamDTO paramDTO = new ParamDTO(message);
        paramDTO.setMessage(message);
        return paramDTO;
    }

    @GetMapping("/greet2")
    public ParamMixDTO greet2(@RequestParam String message, @RequestParam(required = false) Integer code) {
        ParamMixDTO paramMixDTO = new ParamMixDTO(message, code);
        paramMixDTO.setMessage(message);
        paramMixDTO.setCode(code);
        return paramMixDTO;
    }

    @GetMapping("/request")
    public ParamMixDTO request(HttpServletRequest request) {
        int code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException ignored) {
        }
        ParamMixDTO paramMixDTO = new ParamMixDTO();
        paramMixDTO.setMessage(request.getParameter("message"));
        paramMixDTO.setCode(code);
        return paramMixDTO;
    }
}
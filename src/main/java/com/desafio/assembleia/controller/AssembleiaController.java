package com.desafio.assembleia.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AssembleiaController {
    @GetMapping("/")
    public String olaMundo() {
        return "Ola Mundo";
    }
}

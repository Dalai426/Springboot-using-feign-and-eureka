package com.dalai.Provider.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ExportController {
    @GetMapping("/hello")
    public String get(){
        return "It is provider app message !!!!";
    }

}

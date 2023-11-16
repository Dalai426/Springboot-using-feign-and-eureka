package com.dalai.Client.controller;


import com.dalai.Client.ProviderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ImportController {
    private final ProviderClient providerClient;
    @GetMapping("/import")
    public String get(){
        return providerClient.get();
    }

}

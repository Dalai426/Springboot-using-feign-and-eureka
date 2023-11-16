package com.dalai.Client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PROVIDER")
public interface ProviderClient {
    @GetMapping("/hello")
    public String get();

}

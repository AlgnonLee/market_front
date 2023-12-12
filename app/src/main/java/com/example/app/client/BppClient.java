package com.example.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bpp")
public interface BppClient {

    @GetMapping("/test/{test}")
    public String test(@PathVariable("test")String test);
}

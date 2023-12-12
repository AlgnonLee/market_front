package com.example.bpp.demos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test/{test}")
    public String test(@PathVariable("test") String test){
        return test;
    }
}

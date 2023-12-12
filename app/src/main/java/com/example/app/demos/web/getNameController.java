package com.example.app.demos.web;

import com.example.app.client.BppClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${service_name}")
public class getNameController {

    @Autowired
    BppClient bppClient;

    @Value("${name}")
    public String name;

    @GetMapping("/getname/{test}")
    public String getName(@PathVariable("test")String test){
        return name+bppClient.test(test);
    }
}

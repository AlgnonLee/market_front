package com.example.cpp.controllers;

import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cpp")
public class RegisterController {

    private Boolean checked;
    @Autowired
    private UserMapper userMapper;



}

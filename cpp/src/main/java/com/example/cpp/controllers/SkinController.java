package com.example.cpp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/cpp")
public class SkinController {

    @GetMapping("/main")
    public String showMain(){
        return "main";
    }

    @GetMapping("/order")
    public String showOrder(){
        return "main-order";
    }

    @GetMapping("/cart")
    public String showCart(){
        return "main-car";
    }

    @GetMapping("/search")
    public String showSearch(){
        return "main-search";
    }

    @GetMapping("/found_Type")
    public String showType(){
        return "main-type";
    }

    @GetMapping("/itemAdd")
    public String showItemAdd(){
        return "main-additem";
    }

}

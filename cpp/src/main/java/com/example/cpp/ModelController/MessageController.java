package com.example.cpp.ModelController;

import com.example.cpp.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//需要完善
@Controller
@RequestMapping("/cpp")
public class MessageController {
    @Autowired
    private ItemMapper itemMapper;
    //    @Autowired
    //    private CartMapper cartMapper;
    //1.检测用户登录状态    1已登录-》继续，2未登录-》跳转至登录页面
    //2.检测库存状态
    //3.检测余额状态
    //
    @GetMapping("/car/{id}")
    public String addToShoppingCart(@PathVariable("id")String id, Model model, HttpServletRequest request)
    {
        return "message";
    }

    @GetMapping("/buy/{id}")
    public String SecKill(@PathVariable("id")String id,Model model,HttpServletRequest request){
        return "message";
    }
}

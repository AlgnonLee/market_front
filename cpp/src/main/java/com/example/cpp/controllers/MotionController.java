package com.example.cpp.controllers;

import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.Item;
import com.example.cpp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/cpp")
public class MotionController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;

//    @GetMapping("/car/{id}")
//    public String addToCart(@PathVariable("id")String id){
//        return "success"+id;
//    }



//    @GetMapping("/buy/{id}")
//    public String payForItem(@PathVariable("id")String id,HttpServletRequest request, Model model){
//        HttpSession session = request.getSession();
//        Object username = session.getAttribute("user");
//        if(username==null){
//            model.addAttribute("msg","请先进行登录操作");
//            return "message";
//        }
//        //创建并提交订单以及错误检测
//        HashMap<String, Object> itemfilter = new HashMap<>();
//        itemfilter.put("cid",id);
//        HashMap<String, Object> userfilter = new HashMap<>();
//        userfilter.put("username",username);
//        List<Item> items = itemMapper.selectByMap(itemfilter);
//        List<User> users = userMapper.selectByMap(userfilter);
//        //判断客户余额与商品库存
////        if()
//        model.addAttribute("msg","true");
//        return "message";
//    }

//    @GetMapping("/payTogethem")
//    public String payTogethem(@RequestParam(name = "cid")String cid){
//        System.out.println(cid);
//        return "message";
//    }
}

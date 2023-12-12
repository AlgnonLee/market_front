package com.example.cpp.ModelController;

import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/cpp")
public class CartController {

    @Autowired
    private ItemMapper itemMapper;
//    @Autowired
//    private CartMapper cartMapper;

    //t_cart查找某个用户的购物车商品
    @PostMapping("/cart_item_get")
    public List<Item> getItemInCart(HttpServletRequest request){
        List<Item> items = itemMapper.selectList(null);
        return items;
    }

    //余额判断->库存判断->订单生成->购物车表更新->库存减少->返回结果

    @PostMapping("/cart_sumup")
    public boolean PayAllItemSelected(@RequestParam(name = "cid")String cid,HttpServletRequest request){
        return false;
    }
    //匹配商品名与用户id,更新cart表
    @PostMapping("/remove_cart")
    public void RemoveFromCart(@RequestBody Item item,HttpServletRequest request){

    }
}

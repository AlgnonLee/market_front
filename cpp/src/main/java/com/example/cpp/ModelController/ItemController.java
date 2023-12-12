package com.example.cpp.ModelController;

import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.mapper.OrderMapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cpp")
public class ItemController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/item_get")
    public List<Item> Load(){
        List<Item> items = itemMapper.selectList(null);
        return items;
    }
}

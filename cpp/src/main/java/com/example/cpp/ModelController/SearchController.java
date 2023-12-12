package com.example.cpp.ModelController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.mapper.OrderMapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cpp")
public class SearchController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private OrderMapper orderMapper;
    @GetMapping("item_search")
    public List<Item> getSearchResult(@RequestParam(name = "param1")String key, @RequestParam(name = "param2")String value){
        QueryWrapper<Item> itemQueryWrapper = new QueryWrapper<>();
        itemQueryWrapper.like(key,value);
        List<Item> items = itemMapper.selectList(itemQueryWrapper);
        System.out.println(items);
        return items;
    }
}

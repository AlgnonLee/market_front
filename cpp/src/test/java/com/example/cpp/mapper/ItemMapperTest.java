package com.example.cpp.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cpp.pojo.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemMapperTest {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void test(){
        QueryWrapper<Item> itemQueryWrapper = new QueryWrapper<>();
        itemQueryWrapper.like("itemname","so");
        List<Item> items = itemMapper.selectList(itemQueryWrapper);
        System.out.println(items);
    }


}
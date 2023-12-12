package com.example.cpp;

import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.Item;
import com.example.cpp.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CppApplicationTests {

//    @Autowired
//    private UserMapper userMapper;
//    @Test
//    void contextLoads() {
//
//
//        List<User> users = userMapper.selectList(null);
//        System.out.println(users);
//        User user = new User();
//        user.setUsername("kobe");
//        user.setUsername("bryant");
//        userMapper.insert(user);
//        users=userMapper.selectList(null);
//        System.out.println(users);
//    }
    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void test(){
//        Item item = new Item();
//        item.setItemname("some");
//        item.setItem_type("other");
//        item.setItem_storage(11);
//        item.setPrice(22);
//        itemMapper.insert(item);
        List<Item> items = itemMapper.selectList(null);
        System.out.println(items);
    }

}

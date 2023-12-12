package com.example.cpp.ModelController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.mapper.OrderMapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/cpp")
public class ItemManagerController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private OrderMapper orderMapper;
    //匹配id
    @PostMapping("/get_item_store")
    public List<Item> checkItem(HttpServletRequest request){
//        Object user = request.getSession().getAttribute("user");
//        QueryWrapper<Item> wrapper = new QueryWrapper<>();
//        wrapper.eq("uid",user.toString());
//        itemMapper.selectList(wrapper);
        List<Item> items = itemMapper.selectList(null);
        return items;
    }

    @PostMapping("/edit_item")
    public String updateItem(@RequestBody Item item){
        System.out.println(item);
        QueryWrapper<Item> wrapper = new QueryWrapper<>();
        wrapper.eq("cid",item.getCid());
        itemMapper.update(item,wrapper);
        return "success";
    }

    @PostMapping("/delete_item")
    public String deleteItem(@RequestBody Item item){
        QueryWrapper<Item> wrapper = new QueryWrapper<>();
        wrapper.eq("cid",item.getCid());
        itemMapper.delete(wrapper);
        return "success";
    }

    //获取用户身份信息->(返回错误信息)->添加商品->返回成功信息;

    @PostMapping("/plus_item")
    public String addItem(@RequestBody Item item,HttpServletRequest request){
        itemMapper.insert(item);
        return "success";
    }

}

package com.example.cpp.ModelController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cpp.mapper.ItemMapper;
import com.example.cpp.mapper.OrderMapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/cpp")
public class OrderController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private OrderMapper orderMapper;
    @GetMapping("/order_get")
    public List<Order> checkOrder(HttpServletRequest request){
        List<Order> orders = orderMapper.selectList(null);
        return orders;
    }

    @PostMapping("/time_back")
    public boolean orderBack(@RequestBody Order order,HttpServletRequest request){
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        wrapper.eq("oid",order.getOid());
        int delete = orderMapper.delete(wrapper);
        return delete==1;
    }

    @PostMapping("/order_pay")
    public boolean updateOrder(@RequestBody Order order,HttpServletRequest request){
        System.out.println(order);
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        wrapper.eq("oid",order.getOid());
        int update = orderMapper.update(order, wrapper);
        return update==1;
    }
//    接收信息->查询订单->删除订单记录->返回结果
//    id匹配?
    @PostMapping("/order_delete")
    public boolean deleteOrder(@RequestBody Order order,HttpServletRequest request){
        QueryWrapper<Order> wrapper = new QueryWrapper<>();
        wrapper.eq("oid",order.getOid());
        int delete = orderMapper.delete(wrapper);
        return delete==1;
    }
}

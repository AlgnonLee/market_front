package com.example.cpp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("T_ORDER")
public class Order {

    private int oid;
    private int uid;
    private String itemname;
    private boolean status;
    private double price;
}

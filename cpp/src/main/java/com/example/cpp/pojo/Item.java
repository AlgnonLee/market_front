package com.example.cpp.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("T_ITEM")
public class Item {

    private int cid;
    private String itemname;
    private String itemtype;
    private double price;
    private int storage;
}

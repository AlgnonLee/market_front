package com.example.cpp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("USERS")
public class User {
    private int uid;
    private String username;
    private String password;
    private String role;
}

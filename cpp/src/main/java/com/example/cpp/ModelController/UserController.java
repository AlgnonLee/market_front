package com.example.cpp.ModelController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cpp.mapper.UserMapper;
import com.example.cpp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cpp")
public class UserController {
    private Boolean checked;
    @Autowired
    private UserMapper userMapper;

    //注册页面
    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }

    @GetMapping("/user_config")
    public String userConfig(HttpServletRequest request){
        return "main-user";
    }


    @PostMapping("/user_register")
    public String addUser(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password){
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        userMapper.insert(user);
        return "index";
    }

//    登录请求,逻辑存在错误
    @GetMapping("/login")
    public String selectByQuery(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password,
                        HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        params.put("password",password);
        List<User> users = userMapper.selectByMap(params);
        if (users.isEmpty()){
            checked=false;
            return "index";
        }else checked=true;
        session.setAttribute("user",username);
        session.setMaxInactiveInterval(60*60);
        return "main";
    }

    //    addUser->updateUser->deleteOrder->checkUser
    @ResponseBody
    @PostMapping("/get_user_info")
    public User checkUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
        return users.get(0);
    }

    //返回真假判定密码是否修改成功
    @ResponseBody
    @PostMapping("/update_user_info")
    public boolean updateUser(@RequestParam(name = "password")String password,HttpServletRequest request){


        return false;
    }

    //关闭session
    @ResponseBody
    @PostMapping("/user_logout")
    public String Logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "index";
    }

    //
    @PostMapping("/delete_user_info")
    public String deleteUser(HttpServletRequest request){
        return "index";
    }








    //锦上添花的检查
    @ResponseBody
    @GetMapping("/register_check")
    public Boolean checkRegisStat(@RequestParam(name = "username")String username){
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        List<User> users = userMapper.selectByMap(params);
        System.out.println(users);
        checked= users.isEmpty();
        System.out.println(checked);
        return checked;
    }



    @ResponseBody
    @GetMapping("/login_check")
    public Boolean getCheckedStatus(@RequestParam(name = "username")String username,@RequestParam(name = "password")String password){
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        params.put("password",password);
        List<User> users = userMapper.selectByMap(params);
        checked= !users.isEmpty();
        return checked;
    }
}

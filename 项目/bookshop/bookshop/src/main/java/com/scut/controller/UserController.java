package com.scut.controller;

import com.scut.util.Result;
import com.scut.util.ResultGenerator;
import com.scut.entity.User;
import com.scut.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 日志文件
    private static final Logger log = Logger.getLogger(UserController.class);

    /**
     * 验证登录
     *
     * @param user    用户输入的学号与密码封装成的User对象
     * @param request 登录成功时将user存入session当中
     * @return 登录成功后跳转至首页
     */
    @RequestMapping(value = "/sessions", method = RequestMethod.POST)
    @ResponseBody
    public Result checkLogin(@RequestBody User user, HttpServletRequest request) {
        // userService验证是否登录成功
        boolean flag = userService.checkUser(user);
        if (flag) {
            log.info("用户登录成功, user: " + user.toString());
            Map<String, Object> data = new HashMap<>();
            data.put("currentUser", user);
            // 登录成功，将登录信息放入session
            User user1 = userService.getByStudentid(user.getStudentid());
            request.getSession().setAttribute("user", user1);
            return ResultGenerator.genSuccessResult(data);
        } else {
            return ResultGenerator.genFailResult("学号或密码输入错误！");
        }
    }

    /**
     * 登出操作
     *
     * @param request 用于获取session中的User对象
     * @return 登出后跳转至登录界面
     */
    @RequestMapping("/logout.do")
    public ModelAndView logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return new ModelAndView("login");
    }
}

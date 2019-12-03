package com.example.advice.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 定义测试类，进行http请求测试，测试全局异常处理
 */
@RestController
public class MyControllerException {
    /**测试空指针异常捕获方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/show")
    public String show() throws Exception {
        throw new Exception("测试异常");
    }

    /**测试正常方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/nomal")
    public String nomal() throws Exception {
        return "正常程序";
    }

    /**
     * 测试空指针异常捕获方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/showNullPoint")
    public String showNullPoint() throws Exception {
        throw new NullPointerException();
    }


}

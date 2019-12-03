package com.example.advice.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
/**
 * 定义测试类，进行http请求,测试全局数据初始化
 */
@RestController
public class GetDataController {
    /**
     *获取全局数据的方法
     * @param model
     * @return
     */
    @GetMapping("/getData")
    public Object getData(Model model){
        Map<String,Object> map=model.asMap();
        System.out.println(map);

        return map.get("lxc");
    }
}

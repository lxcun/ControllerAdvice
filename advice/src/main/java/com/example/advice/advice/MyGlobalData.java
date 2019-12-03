package com.example.advice.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义全局数据，进行全局数据初始化
 */
@ControllerAdvice
public class MyGlobalData {
    /**
     * 使用 @ModelAttribute 注解标记该方法的返回数据是一个全局数据
     * 默认情况下，全局数据的 key 就是返回的变量名，value 就是方法返回值
     * 开发者可以通过 @ModelAttribute 注解的 name 属性去重新指定 key。
     * @return
     */
    @ModelAttribute(name ="lxc")
    public Map<String,Object> getMyData(){
        Map<String,Object>map=new HashMap<>();
        map.put("name","lili");
        map.put("isBoy","yes");
        return map;
    }
}

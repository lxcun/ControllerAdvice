package com.example.advice.advice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MyBindData {
    /**
     * 学校属性的绑定
     * @param binder
     */
     @InitBinder("school")
    public void initSchool(WebDataBinder binder){
      binder.setFieldDefaultPrefix("school.");
     }

    /**班级属性的绑定
     * @param binder
     */
    @InitBinder("classes")
    public void initClasses(WebDataBinder binder){
        binder.setFieldDefaultPrefix("classes.");
    }
}

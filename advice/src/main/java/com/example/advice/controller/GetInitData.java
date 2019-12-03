package com.example.advice.controller;

import com.example.advice.entity.School;
import com.example.advice.entity.Class;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定义测试类，进行http请求,测试全局数据绑定
 */
@RestController
public class GetInitData {
    @GetMapping("/getInputData")
    public String getInputData(School school,Class classes){
        StringBuilder stringBuilder=new StringBuilder();
        if(school!=null&&classes!=null){
            stringBuilder.append(school.getName());
            stringBuilder.append("学校有");
            stringBuilder.append(school.getClassNumbers());
            stringBuilder.append("个班级，其中");
            stringBuilder.append(classes.getName());
            stringBuilder.append("班是尖子班，有");
            stringBuilder.append(classes.getStudentNumbers());
            stringBuilder.append("个学生");
        }
        return stringBuilder.toString();
    }
    @GetMapping("/getInputDataBind")
    public String getInputDataBind(@ModelAttribute("school") School school,@ModelAttribute("classes") Class classes){
        StringBuilder stringBuilder=new StringBuilder();
        if(school!=null&&classes!=null){
            stringBuilder.append(school.getName());
            stringBuilder.append("学校有");
            stringBuilder.append(school.getClassNumbers());
            stringBuilder.append("个班级，其中");
            stringBuilder.append(classes.getName());
            stringBuilder.append("班是尖子班，有");
            stringBuilder.append(classes.getStudentNumbers());
            stringBuilder.append("个学生");
        }
        return stringBuilder.toString();
    }
}

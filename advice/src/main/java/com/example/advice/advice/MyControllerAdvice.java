package com.example.advice.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller增强器
 *
 * @author jim
 * @date 2017/11/23
 */
/*对ControllerAdvice的学习解释
可以实现三个功能：全局异常处理、全局数据绑定、全局数据预处理
在类中，可以定义多个方法，不同的方法处理不同的异常
例如专门处理空指针的方法、专门处理数组越界的方法...，
也可以直接在一个方法中处理所有的异常信息。
@ExceptionHandler 注解用来指明异常的处理类型
即如果指定为 NullpointerException，则数组越界异常就不会进到这个方法中来。
 */
@ControllerAdvice
public class MyControllerAdvice {
    /**
     * 设置要捕获的空指针异常，并作出处理
     * 注意：这里可以返回试图，也可以放回JSON，这里就当做一个Controller使用
     *
     * @param request {@link NativeWebRequest}
     * @param e {@link NullPointerException }
     * @return {@link Map}
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public Map processUnauthenticatedNullPointerException(NativeWebRequest request, NullPointerException e) {

        System.out.println("===========应用到所有@RequestMapping注解的方法，在其抛出Exception异常时执行");
        Map map = new HashMap(5);
        map.put("code", 404);
        map.put("msg", "空指针异常");
        return map;
    }
    /**
     * 设置要捕获的异常，并作出处理
     * 注意：这里可以返回试图，也可以放回JSON，这里就当做一个Controller使用
     *
     * @param request {@link NativeWebRequest}
     * @param e {@link Exception}
     * @return {@link Map}
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map processUnauthenticatedException(NativeWebRequest request, Exception e) {

        System.out.println("===========应用到所有@RequestMapping注解的方法，在其抛出Exception异常时执行");
        Map map = new HashMap(5);
        map.put("code", 404);
        map.put("msg", e.getMessage());
        return map;
    }
}

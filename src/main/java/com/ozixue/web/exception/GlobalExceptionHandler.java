package com.ozixue.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常
 */
@ControllerAdvice// 控制器切面
public class GlobalExceptionHandler {

    /**
     * 处理Controller异常
     *
     * @return
     */
    @ExceptionHandler(RuntimeException.class)// 捕获运行时异常
    @ResponseBody// 返回json数据
    public Map<String, Object> exceptionHandler() {
        Map<String, Object> map = new HashMap<>();
        map.put("errorCode", "101");
        map.put("errorMsg", "系统错误!");
        return map;
    }
}

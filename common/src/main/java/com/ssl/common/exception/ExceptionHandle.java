package com.ssl.common.exception;

import com.ssl.common.common.AjaxResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能描述：
 *
 * @Date: 2020/11/4 22:40
 */
@ControllerAdvice
public class ExceptionHandle {
    @ResponseBody
    @ExceptionHandler(CustomGenericException.class)
    public AjaxResult customGenericExceptionHnadler(CustomGenericException e) { //还可以声明接收其他任意参数
        return AjaxResult.error(e.getErrCode(), e.getErrMsg());
    }
}

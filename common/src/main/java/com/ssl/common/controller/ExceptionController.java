package com.ssl.common.controller;

import com.ssl.common.common.AjaxResult;
import com.ssl.common.exception.CustomGenericException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 功能描述：
 *
 * @Date: 2020/11/4 23:40
 */
@RestController
@RequestMapping("ex")
public class ExceptionController {
    @RequestMapping("test")
    public AjaxResult getList() throws CustomGenericException {
        test();
        return AjaxResult.success();
    }

    public void test() throws CustomGenericException {
        throw new CustomGenericException(1, "illegal param");
    }
}

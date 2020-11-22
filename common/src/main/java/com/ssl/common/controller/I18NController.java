package com.ssl.common.controller;

import com.ssl.common.common.Constant;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 功能描述：
 *
 * @Date: 2020/8/23 23:19
 */
@RestController
public class I18NController {

    public String testI18n(){
        return Constant.RESOURCEBUNDLE.getString("index.greeting");
    }

}

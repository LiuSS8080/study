package com.ssl.common.internation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

/**
 * 功能描述：转换语言
 *
 * @Date: 2020/8/29 22:42
 */
@Controller
public class LocaleController {

    private Logger logger = LoggerFactory.getLogger(Locale.class);

    @GetMapping("/language")
    public String language(String l){
        return "static/i18n";
    }
}

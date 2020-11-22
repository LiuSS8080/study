package com.ssl.common.internation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * 功能描述：注入MyLocaleResolver
 *
 * @Date: 2020/8/29 21:29
 */
@Configuration
public class I18nConfig {
    private static Logger logger = LoggerFactory.getLogger(I18nConfig.class);

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }


}

package com.ssl.common.controller;

import com.ssl.common.tool.LocationHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * 功能描述：
 *
 * @Date: 2020/8/6 23:05
 */
@Controller
@RequestMapping("test")
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("test1")
    public String test() {
        logger.info("i come here,{}",TestController.class.getName());
        return "index";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2() {
        logger.info("i come here,{}",TestController.class.getName());
        return "OK";
    }

    /**
     * 打开文件 VM Option,添加-Djava.awt.headless=false
     *
     * @param fileName
     * @return
     */
    @RequestMapping("openFile")
    @ResponseBody
    public String openFile(String fileName) {
        String path = LocationHelper.buildFilePath("E:", "300 生活", fileName);
        logger.info("Open File:{}", path);
        try {
            LocationHelper.openFile(path);
        } catch (IOException e) {
            logger.error("Open file error:{}", path);
        }
        return "OK";
    }


}

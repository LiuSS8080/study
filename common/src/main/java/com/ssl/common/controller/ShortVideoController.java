package com.ssl.common.controller;

import com.ssl.common.pojo.ShortVideo;
import com.ssl.common.service.IShortVideoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述：springboot 控制层
 *
 * @Date: 2020/8/8 20:49
 */
@RestController
@RequestMapping("shortVideo")
public class ShortVideoController {

    @Resource
    IShortVideoService shortVideo;

    @RequestMapping("getList")
    public List<ShortVideo> getList() {
        return shortVideo.getList();
    }

}

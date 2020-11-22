package com.ssl.common.service;

import com.ssl.common.pojo.ShortVideo;

import java.util.List;

/**
 * 功能描述：springboot 业务层
 *
 * @Date: 2020/8/8 20:59
 */
public interface IShortVideoService {
    /**
     * 查询集合
     *
     * @return 集合
     */
    List<ShortVideo> getList();
}

package com.ssl.common.mapper;

import com.ssl.common.pojo.ShortVideo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 功能描述：springboot 数据库操作层
 *
 * @Date: 2020/8/8 20:55
 */
public interface ShortViedoMapper {
    /**
     * 查询集合
     *
     * @return 集合
     */
    List<ShortVideo> getList();
}

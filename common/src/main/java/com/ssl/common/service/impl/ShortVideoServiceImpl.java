package com.ssl.common.service.impl;

import com.ssl.common.mapper.ShortViedoMapper;
import com.ssl.common.pojo.ShortVideo;
import com.ssl.common.service.IShortVideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述：
 *
 * @Date: 2020/8/8 21:19
 */
@Service
public class ShortVideoServiceImpl implements IShortVideoService {

    private static Logger logger = LoggerFactory.getLogger(ShortVideoServiceImpl.class);

    @Resource
    ShortViedoMapper shortViedoMapper;

    @Override
    public List<ShortVideo> getList() {
        List<ShortVideo> list = shortViedoMapper.getList();
        return list;
    }
}

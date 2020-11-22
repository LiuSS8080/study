package com.ssl.common.common;

import com.ssl.common.pojo.ShortVideo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 功能描述：java8新特性 stream
 *
 * @Date: 2020/9/5 20:31
 */
public class StreamHelper {
    public static void main(String[] args) {
        ShortVideo shortVideo = new ShortVideo();
        shortVideo.setAreaName("A");
        ShortVideo shortVideo2 = new ShortVideo();
        shortVideo2.setAreaName("B");
        ShortVideo shortVideo3 = new ShortVideo();
        shortVideo3.setAreaName("C");
        ShortVideo shortVideo4 = new ShortVideo();
        shortVideo4.setAreaName("D");
        ShortVideo shortVideo5 = new ShortVideo();
        shortVideo5.setAreaName("A");
        ShortVideo shortVideo6 = new ShortVideo();
        shortVideo6.setAreaName("B");

        List<ShortVideo> list = new ArrayList<>();
        list.add(shortVideo);
        list.add(shortVideo2);
        list.add(shortVideo3);
        list.add(shortVideo4);
        list.add(shortVideo5);
        list.add(shortVideo6);

        //过滤
        list.stream().filter(ShortVideo::isIllegal).collect(Collectors.toList()).forEach(item -> System.out.println(item));
        //分组
        Map<String, List<ShortVideo>> collect = list.stream().collect(Collectors.groupingBy(ShortVideo::getAreaName));
        for (Map.Entry entry : collect.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("==========");
        }
        list.stream().mapToInt(ShortVideo::getTotal).sum();

        Optional<ShortVideo> first = list.stream().filter(ShortVideo::isIllegal).findFirst();
        first.isPresent();
        first.get();


    }
}

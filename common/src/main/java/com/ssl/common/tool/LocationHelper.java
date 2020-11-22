package com.ssl.common.tool;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * 功能描述：路径
 *
 * @Date: 2020/8/4 22:42
 */
public class LocationHelper {
    /**
     * 获取用户主目录 C:\Users\87124
     *
     * @return
     */
    public static String getUserHome() {
        return System.getProperties().getProperty("user.home");
    }

    /**
     * 获取系统文件分隔符 /   \
     *
     * @return
     */
    public static String getSysSeparator() {
        return System.getProperties().getProperty("file.separator");
    }

    /**
     * 打开指定本地文件
     *
     * @param path 文件路径
     * @throws IOException
     */
    public static void openFile(String path) throws IOException {
        File file=new File(path);
        Desktop.getDesktop().open(file);
    }

    public static String buildFilePath(String... names) {
        StringBuilder sb = new StringBuilder();
        for (String str : names) {
            sb.append(str).append(getSysSeparator());
        }
        sb.substring(0, sb.length()-2);
        return sb.toString();
    }

}

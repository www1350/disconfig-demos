package com.absurd.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/***
 *
 */
@DisconfFile(filename = "static.properties")
public class OneStaticConfig {
    private static Long uid;
    private static String username;
    private static String password;

    public static void setUid(Long uid) {
        OneStaticConfig.uid = uid;
    }

    public static void setUsername(String username) {
        OneStaticConfig.username = username;
    }

    public static void setPassword(String password) {
        OneStaticConfig.password = password;
    }

    @DisconfFileItem(name = "uid", associateField = "uid")
    public static Long getUid() {
        return uid;
    }


    @DisconfFileItem(name = "username", associateField = "username")
    public static String getUsername() {
        return username;
    }


    @DisconfFileItem(name = "password", associateField = "password")
    public static String getPassword() {
        return password;
    }


}

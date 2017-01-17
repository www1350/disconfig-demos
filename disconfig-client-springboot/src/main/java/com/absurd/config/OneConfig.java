package com.absurd.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/***
 *
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "config1.properties")
@DisconfUpdateService(classes = {OneConfig.class})
public class OneConfig implements IDisconfUpdate {
    Logger logger = LoggerFactory.getLogger(getClass());
    private Long uid;
    private String username;
    private String password;

    @DisconfFileItem(name = "uid", associateField = "uid")
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @DisconfFileItem(name = "username", associateField = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @DisconfFileItem(name = "password", associateField = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "OneConfig{" +
                "uid=" + getUid() +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }

    public void reload() throws Exception {
        logger.info(">>>>>>>>>>配置已改变>>>>>>>>>>>>");

    }
}

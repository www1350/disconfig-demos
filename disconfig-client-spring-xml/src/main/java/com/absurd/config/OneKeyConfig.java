package com.absurd.config;

import com.baidu.disconf.client.common.annotations.DisconfItem;
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
@DisconfUpdateService(classes = {OneKeyConfig.class},itemKeys = "absurd-app-rd-1")
public class OneKeyConfig implements IDisconfUpdate {
    Logger logger = LoggerFactory.getLogger(getClass());
    private Long key;
    @DisconfItem(key = "absurd-app-rd-1")
    public Long getKey() {
        return key;
    }

    public void reload() throws Exception {
        logger.info(">>>>>>>>>>key配置已改变>>>>>>>>>>>>");
    }
}

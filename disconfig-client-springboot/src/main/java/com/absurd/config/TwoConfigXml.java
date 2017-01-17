package com.absurd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/***
 *
 */
@Service
public class TwoConfigXml {
    @Value("${pid}")
    private String pid;
    @Value("${sid}")
    private String sid;
    @Value("${content}")
    private String content;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

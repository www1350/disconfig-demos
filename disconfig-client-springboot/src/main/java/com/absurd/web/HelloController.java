package com.absurd.web;

import com.absurd.config.OneConfig;
import com.absurd.config.OneKeyConfig;
import com.absurd.config.OneStaticConfig;
import com.absurd.config.TwoConfigXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private OneConfig oneConfig;
    @Autowired
    private OneKeyConfig oneKeyConfig;

    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "config")
    @ResponseBody
    public String config1() {
        return oneConfig.getUid()+":"+oneConfig.getUsername()+":"+oneConfig.getPassword();
    }

    @Autowired
    private TwoConfigXml xmlconfig;

    @RequestMapping(value = "configxml")
    @ResponseBody
    public String config_xml() {
        return xmlconfig.getPid()+":"+xmlconfig.getContent();
    }

    @RequestMapping(value = "configkey")
    @ResponseBody
    public Long config_key() {
        return oneKeyConfig.getKey();
    }

    @RequestMapping(value = "configj")
    @ResponseBody
    public OneConfig config1_json() {
        OneConfig copy = new OneConfig();
        copy.setUid(oneConfig.getUid());
        copy.setUsername(oneConfig.getUsername());
        copy.setPassword(oneConfig.getPassword());
        return copy;
    }


    @RequestMapping(value = "configstatic")
    @ResponseBody
    public String config1_static_json() {
        return OneStaticConfig.getUid()+
                ":"+OneStaticConfig.getUsername()+
                ":"+OneStaticConfig.getPassword();
    }
}

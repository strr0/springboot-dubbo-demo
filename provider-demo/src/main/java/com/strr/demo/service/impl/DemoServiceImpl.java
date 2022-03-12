package com.strr.demo.service.impl;

import com.strr.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return String.format("hello %s~", name);
    }
}

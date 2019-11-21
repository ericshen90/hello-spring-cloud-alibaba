package com.eric.spring.cloud.alibaba.comsumer.controller;

import com.eric.spring.cloud.alibaba.comsumer.service.EchoService;
import java.io.PipedReader;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-11-21
 */
@RefreshScope
@RestController
public class TestConfigController {

  @Value("${user.name}")
  private String name;

  @Resource
  private EchoService echoService;

  @GetMapping(value = "nacos/config")
  public String config() {
    return name;
  }

  @GetMapping(value = "nacos/config/lb")
  public String lb() {
    return echoService.lb() + name;
  }
}

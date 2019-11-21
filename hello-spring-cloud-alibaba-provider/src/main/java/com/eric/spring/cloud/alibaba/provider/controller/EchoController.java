package com.eric.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-11-19
 */
@RestController
public class EchoController {

  @Value("${server.port}")
  private int port;

  @GetMapping(value = "/echo/{name}")
  public String echo(@PathVariable String name) {
    return "Hello Alibaba Nacos Provider " + name;
  }

  @GetMapping(value = "loadBalance")
  public String lb(){
    return "The port of Nacos Provider is " + port;
  }

}

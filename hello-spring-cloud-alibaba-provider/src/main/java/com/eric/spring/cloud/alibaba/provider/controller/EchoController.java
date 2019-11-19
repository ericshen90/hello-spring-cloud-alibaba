package com.eric.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-11-19
 */
@RestController
public class EchoController {

  @GetMapping(value = "/echo/{name}")
  public String echo(@PathVariable String name) {
    return "Hello Alibaba Nacos Provider " + name;
  }
}

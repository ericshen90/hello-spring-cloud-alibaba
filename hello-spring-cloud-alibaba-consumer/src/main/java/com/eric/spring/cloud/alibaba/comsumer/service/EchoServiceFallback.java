package com.eric.spring.cloud.alibaba.comsumer.service;

import org.springframework.stereotype.Component;

/**
 * @author EricShen
 * @date 2019-11-25
 */
@Component
public class EchoServiceFallback implements EchoService {

  @Override
  public String echo(String str) {
    return "echo not work, this is fallback";
  }

  @Override
  public String lb() {
    return "lb not work, this is fallback";
  }
}

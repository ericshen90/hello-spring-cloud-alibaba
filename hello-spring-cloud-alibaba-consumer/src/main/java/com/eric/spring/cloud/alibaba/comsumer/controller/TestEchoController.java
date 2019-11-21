package com.eric.spring.cloud.alibaba.comsumer.controller;

import com.eric.spring.cloud.alibaba.comsumer.service.EchoService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-11-21
 */
@RestController
public class TestEchoController {

  @Resource
  private EchoService echoService;

  @GetMapping(value = "feign/echo/{name}")
  public String echo(@PathVariable String name){
    return echoService.echo(name);
  }

  @GetMapping(value = "loadBalance")
  public String lb(){
    return echoService.lb();
  }


}

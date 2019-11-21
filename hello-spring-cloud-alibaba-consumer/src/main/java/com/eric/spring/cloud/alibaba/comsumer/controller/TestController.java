package com.eric.spring.cloud.alibaba.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author EricShen
 * @date 2019-11-19
 */
@RestController(value = "/")
public class TestController {

  private final RestTemplate restTemplate;

  @Autowired
  public TestController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping(value = "echo/{name}")
  public String echo(@PathVariable String name) {
    return restTemplate.getForObject("http://service-provider/echo/" + name, String.class);
  }


}

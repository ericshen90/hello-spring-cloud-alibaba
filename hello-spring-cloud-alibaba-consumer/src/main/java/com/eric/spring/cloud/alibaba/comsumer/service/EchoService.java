package com.eric.spring.cloud.alibaba.comsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author EricShen
 * @date 2019-11-21
 */
@FeignClient(value = "service-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

  @GetMapping(value = "echo/{name}")
  String echo(@PathVariable("name") String str);

  @GetMapping(value = "loadBalance")
  String lb();

}

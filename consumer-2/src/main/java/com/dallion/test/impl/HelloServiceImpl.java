package com.dallion.test.impl;

import com.dallion.test.api.HelloService;

public class HelloServiceImpl implements HelloService {

  public String sayHello(String str) {
    return "Hello" + str;
  }

}

package com.dallion.test.impl;

import com.dallion.test.api.HelloService;

public class HelloServiceImpl implements HelloService {

  public String sayHello(String str) {
    System.out.println("Receive from " + str);
    return "Hello" + str + " from provider - 2";
  }

}

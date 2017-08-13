package com.wq.strategy.behaviour.quackimpl;

import com.wq.strategy.behaviour.QuackBehaviour;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: Quack
  * Author:   wq
  * Date:     2017/8/13 14:40
  * Description: 鸭子呱呱叫
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("i am a duck ,and i will quack!");
    }
}

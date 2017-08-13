package com.wq.strategy.duck;

import com.wq.strategy.behaviour.quackimpl.Quack;
import com.wq.strategy.behaviour.flyimpl.FlyWithWing;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: MiniDuck
  * Author:   wq
  * Date:     2017/8/13 13:52
  * Description: 迷你小鸭子
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public class MiniDuck extends Duck {
    public MiniDuck(){
        flyBehaviour=new FlyWithWing();
        quackBehaviour=new Quack();
    }

    @Override
    public void display() {
        System.out.println("i am a miniDuck!");
    }
}

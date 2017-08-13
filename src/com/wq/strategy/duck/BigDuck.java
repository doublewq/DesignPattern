package com.wq.strategy.duck;

import com.wq.strategy.behaviour.flyimpl.FlyNoWay;
import com.wq.strategy.behaviour.quackimpl.Squeak;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: BigDuck
  * Author:   wq
  * Date:     2017/8/13 14:58
  * Description: 打鸭子
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public class BigDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am a big Duck!");
    }

    public BigDuck(){
        flyBehaviour=new FlyNoWay();
        quackBehaviour=new Squeak();
    }
}

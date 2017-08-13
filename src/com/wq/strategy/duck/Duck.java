package com.wq.strategy.duck;

import com.wq.strategy.behaviour.FlyBehaviour;
import com.wq.strategy.behaviour.QuackBehaviour;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: Duck
  * Author:   wq
  * Date:     2017/8/13 13:38
  * Description: 鸭子类
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}

package com.wq.strategy.behaviour.flyimpl;

import com.wq.strategy.behaviour.FlyBehaviour;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: FlyWithWing
  * Author:   wq
  * Date:     2017/8/13 14:38
  * Description: 有翅膀的鸭子飞
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public class FlyWithWing implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I hava WIng,and i can fly!");
    }
}

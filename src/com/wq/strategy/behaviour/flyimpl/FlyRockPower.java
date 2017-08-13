package com.wq.strategy.behaviour.flyimpl;

import com.wq.strategy.behaviour.FlyBehaviour;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: FlyRockPower
  * Author:   wq
  * Date:     2017/8/13 15:07
  * Description: 有火箭动力的鸭子飞行行为
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public class FlyRockPower implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("i have a rock,i have power!");
    }
}

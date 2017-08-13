package com.wq.strategy.behaviour.flyimpl;

import com.wq.strategy.behaviour.FlyBehaviour;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: FlyNoWay
  * Author:   wq
  * Date:     2017/8/13 14:39
  * Description: 不会飞的飞行行为
  * History:
  * <author>          <time>          <version>          <desc>
  *  温庆           修改时间           版本号              描述
  */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("i have no wing ,and i can't fly!");
    }
}

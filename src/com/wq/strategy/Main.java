package com.wq.strategy;

import com.wq.strategy.behaviour.flyimpl.FlyRockPower;
import com.wq.strategy.behaviour.flyimpl.FlyWithWing;
import com.wq.strategy.duck.BigDuck;
import com.wq.strategy.duck.Duck;
import com.wq.strategy.duck.MiniDuck;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Duck xiao=new MiniDuck();
        xiao.performFly();
        xiao.performQuack();
        xiao.display();

        System.out.println("-----------------");
        Duck big=new BigDuck();
        big.display();
        big.performFly();
        big.setFlyBehaviour(new FlyRockPower());
        big.performFly();
    }
}

package com.dylanrathbone.model.duck;

import com.dylanrathbone.model.fly.FlyWithWings;
import com.dylanrathbone.model.quack.Quack;


public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void Display() {
        System.out.println("Im a real mallard duck!");

    }
}

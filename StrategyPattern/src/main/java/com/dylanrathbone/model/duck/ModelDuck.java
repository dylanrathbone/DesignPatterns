package com.dylanrathbone.model.duck;

import com.dylanrathbone.model.fly.FlyNoWay;
import com.dylanrathbone.model.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void Display() {
        System.out.println("I'm a model duck!");
    }
}

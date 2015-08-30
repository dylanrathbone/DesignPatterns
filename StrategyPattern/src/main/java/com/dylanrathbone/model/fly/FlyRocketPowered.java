package com.dylanrathbone.model.fly;

import com.dylanrathbone.interfaces.FlyBehaviour;


public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying with a Rocket!");
    }
}

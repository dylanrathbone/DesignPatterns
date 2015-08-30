package com.dylanrathbone.model.fly;

import com.dylanrathbone.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}

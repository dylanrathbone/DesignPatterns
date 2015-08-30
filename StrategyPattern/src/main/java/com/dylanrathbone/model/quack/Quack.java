package com.dylanrathbone.model.quack;

import com.dylanrathbone.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

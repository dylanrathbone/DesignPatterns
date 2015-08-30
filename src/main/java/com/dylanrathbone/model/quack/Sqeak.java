package com.dylanrathbone.model.quack;

import com.dylanrathbone.interfaces.QuackBehaviour;


public class Sqeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Sqeak");
    }
}

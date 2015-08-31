package com.dylanrathbone;

import com.dylanrathbone.model.duck.Duck;
import com.dylanrathbone.model.duck.MallardDuck;
import com.dylanrathbone.model.duck.ModelDuck;
import com.dylanrathbone.model.fly.FlyRocketPowered;
import com.dylanrathbone.model.quack.Sqeak;


public class MiniDuckSimulator {

    public static void main(String [] args){

        //Initialize two ducks of a specific type
        Duck mallard = new MallardDuck();
        Duck modelDuck = new ModelDuck();

        //Make the mallard perform some specific behaviour, notice how the mallard just knows
        //how it should quack and fly!
        mallard.performQuack();
        mallard.performFly();

        //Make the model duck perform some specific behaviour, notice how the mallard just knows
        //how it should quack and fly!
        modelDuck.performFly();
        modelDuck.performQuack();

        //Dynamically reset fly and quack behaviour via setter methods
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.setQuackBehaviour(new Sqeak());

        //See how behaviour is changed...
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}

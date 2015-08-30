package com.dylanrathbone;

import com.dylanrathbone.model.duck.Duck;
import com.dylanrathbone.model.duck.MallardDuck;
import com.dylanrathbone.model.duck.ModelDuck;
import com.dylanrathbone.model.fly.FlyRocketPowered;
import com.dylanrathbone.model.quack.Sqeak;


public class MiniDuckSimulator {

    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        Duck modelDuck = new ModelDuck();

        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.Display();

        //Call the flyBehaviour and quackBehaviour set at modelDuck initialization via constructor
        modelDuck.performFly();
        modelDuck.performQuack();


        //Dynamically reset fly and quack behaviour via setter methods
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.setQuackBehaviour(new Sqeak());

        //See how behaviour is changed...
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.Display();
    }
}

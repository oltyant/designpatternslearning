package oltyant.oo.strategy.solution;

import oltyant.oo.strategy.solution.behaviour.LoudQuack;
import oltyant.oo.strategy.solution.behaviour.FlyingHigh;

/**
 * Created by oltyant on 2015.11.17..
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyingHigh(), new LoudQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard duck!");
    }
}

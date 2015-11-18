package oltyant.oo.strategy.solution;

import oltyant.oo.strategy.solution.behaviour.CannotFly;
import oltyant.oo.strategy.solution.behaviour.LoudQuack;

/**
 * Created by oltyant on 2015.11.17..
 */
public class ModelDuck extends Duck {
    protected ModelDuck() {
        super(new CannotFly(), new LoudQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a Model duck!");
    }
}

package oltyant.oo.strategy.solution;

import oltyant.oo.strategy.solution.behaviour.CannotFly;
import oltyant.oo.strategy.solution.behaviour.Squeak;

/**
 * Created by oltyant on 2015.11.17..
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber!");
    }
}

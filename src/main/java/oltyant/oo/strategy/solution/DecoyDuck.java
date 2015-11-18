package oltyant.oo.strategy.solution;

import oltyant.oo.strategy.solution.behaviour.MuteQuack;
import oltyant.oo.strategy.solution.behaviour.CannotFly;

/**
 * Created by oltyant on 2015.11.17..
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new CannotFly(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Wooden duck!");
    }
}

package oltyant.oo.strategy.solution.behaviour;

/**
 * Created by oltyant on 2015.11.17..
 */
public class CannotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}

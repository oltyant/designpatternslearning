package oltyant.oo.strategy.solution.behaviour;

/**
 * Created by oltyant on 2015.11.17..
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

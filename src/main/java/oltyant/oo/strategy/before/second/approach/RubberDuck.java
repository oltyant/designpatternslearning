package oltyant.oo.strategy.before.second.approach;

/**
 * Created by oltyant on 2015.11.17..
 */
public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

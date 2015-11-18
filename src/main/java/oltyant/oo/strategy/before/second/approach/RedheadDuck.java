package oltyant.oo.strategy.before.second.approach;

/**
 * Created by oltyant on 2015.11.17..
 */
public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("I'm a Redhead Duck!");
    }

    @Override
    public void fly() {
        System.out.println("Flying high!");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

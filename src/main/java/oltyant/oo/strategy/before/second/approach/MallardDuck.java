package oltyant.oo.strategy.before.second.approach;

/**
 * Created by oltyant on 2015.11.17..
 */
public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
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

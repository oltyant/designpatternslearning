package oltyant.oo.strategy.before.worst.approach;

/**
 * Created by oltyant on 2015.11.17..
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }

    @Override
    public void quack() {
        System.out.println("<<Mute>>");
    }
}

package oltyant.oo.strategy.before.second.approach;

/**
 * Created by oltyant on 2015.11.17..
 */
abstract public class Duck {
    public void move() {
        System.out.println("Every duck can move!");
    }

    public void swim() {
        System.out.println("Every duck can swim like a charm!");
    }

    public abstract void display();
}

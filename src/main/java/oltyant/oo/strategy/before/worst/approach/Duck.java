package oltyant.oo.strategy.before.worst.approach;

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

    public void fly() {
        System.out.println("Flying high!");
    }

    public void quack() {
        System.out.println("Quack!");
    }

    public abstract void display();
}

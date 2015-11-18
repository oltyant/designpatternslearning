package oltyant.oo.strategy.solution;

import oltyant.oo.strategy.solution.behaviour.FlyBehaviour;
import oltyant.oo.strategy.solution.behaviour.QuackBehaviour;

/**
 * Created by oltyant on 2015.11.17..
 */
abstract public class Duck {
    protected FlyBehaviour flying;
    protected QuackBehaviour quacking;

    //In this case I could enhance the original code with a constraint here
    //the protected constructor makes the children use a super call with the mandatory param of flying and quacking behaviour
    //so without we make the behaviours final we implicitly make them final in order to avoid any NPEs
    protected Duck(final FlyBehaviour flying, final QuackBehaviour quacking) {
        this.flying = flying;
        this.quacking = quacking;
    }

    public void setFlying(final FlyBehaviour flying) {
        this.flying = flying;
    }

    public void setQuacking(final QuackBehaviour quacking) {
        this.quacking = quacking;
    }

    public void swim() {
        System.out.println("Every duck can swim as an expert!");
    }

    public void performFly() {
        display();
        this.flying.fly();
    }

    public void performQuack() {
        display();
        this.quacking.quack();
    }

    abstract public void display();
}

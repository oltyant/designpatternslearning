package oltyant.oo.strategy.solution;

import oltyant.oo.strategy.solution.behaviour.FlyRocketPowered;

/**
 * Created by oltyant on 2015.11.17..
 */
public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.setFlying(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
    }
}

package oltyant.oo.strategy.solution.behaviour;

/**
 * Created by oltyant on 2015.11.17..
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Mute>>");
    }
}

package strategy.quackAndFly;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("good fly");
    }

}
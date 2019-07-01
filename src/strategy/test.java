package strategy;

import strategy.quackAndFly.BadFlyBehavior;
import strategy.quackAndFly.GaGaQuackBehavior;

/**
 * 策略模式测试
 */
public class test {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        // 红鸭子和绿鸭子
        redHeadDuck.Fly(); // 超类鸭子的方法
        redHeadDuck.Quack();

        greenHeadDuck.Fly();
        greenHeadDuck.Quack();

        System.out.println("--------------分割线-------------");
        // 再次设定或改变不同的叫声和飞行方式
        redHeadDuck.setmFlyBehavior(new BadFlyBehavior());
        redHeadDuck.setmQuackBehavior(new GaGaQuackBehavior());
        redHeadDuck.Fly(); // 超类鸭子的方法
        redHeadDuck.Quack();
    }
}

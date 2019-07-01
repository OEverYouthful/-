package strategy;

import strategy.quackAndFly.GaGaQuackBehavior;
import strategy.quackAndFly.GoodFlyBehavior;

/**
 * 红鸭子
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        mFlyBehavior=new GoodFlyBehavior();
        mQuackBehavior=new GaGaQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("redDuck");
    }
}
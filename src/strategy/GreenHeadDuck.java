package strategy;

import strategy.quackAndFly.BadFlyBehavior;
import strategy.quackAndFly.GeGeQuackBehavior;

/**
 * 绿鸭子
 */
public class GreenHeadDuck extends Duck{


    /**
     * 鸭子用飞行和叫声的两个接口做变量
     * 不同的飞行和叫声的实现类重写方法，赋值给抽象鸭子的飞行和叫声构造方法
     * 从而实现不同的飞行和叫声
     */
    public GreenHeadDuck() {
        mFlyBehavior=new BadFlyBehavior();
        mQuackBehavior=new GeGeQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("greenDuck");
    }

}
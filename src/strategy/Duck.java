package strategy;

import strategy.quackAndFly.FlyBehavior;
import strategy.quackAndFly.QuackBehavior;

/**
 * 策略模式
 */
public abstract class Duck {
    /**
     * 父类定义行为出来，但是没有具体实例化
     */
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {
    }
// 飞行
    public void Fly() {
        if (mFlyBehavior!=null) {
            mFlyBehavior.fly();
        }
    }
// 叫声
    public void Quack() {
        if (mQuackBehavior!=null) {
            mQuackBehavior.quack();
        }
    }

    /**
     * 子类可以透过两个行为的set方法去动态改变自己的具体行为
     */
    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }

    public abstract void display();
}

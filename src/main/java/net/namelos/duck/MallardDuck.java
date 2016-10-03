package net.namelos.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void Display() {
        System.out.println("I'm a real Mallard duck");
    }
}

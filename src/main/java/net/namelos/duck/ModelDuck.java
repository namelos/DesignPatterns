package net.namelos.duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void Display() {
        System.out.println("I'm a model duck");
    }
}

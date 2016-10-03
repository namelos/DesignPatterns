package net.namelos.duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MiniDuckSimulator.testMallardDuck();
        System.out.println("=====");
        MiniDuckSimulator.testRocketPoweredDuck();
    }

    public static void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    public static void testRocketPoweredDuck() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRockerPowered());
        model.performFly();
    }
}

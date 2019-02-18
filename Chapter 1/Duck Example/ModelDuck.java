package app;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
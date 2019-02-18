package app;
// Specific child class of Duck with Specific behaviors
public class MallardDuck extends Duck {

    public MallardDuck() {
        // We set the behaviors of the Duck with this constructor. The specific implementation is within each class.
        // This allows the coder to NOT write the implementation of Quack and Fly whenevr a specific duck can fly.
        // Also each behaviors can Easily be changed the way a programmer wants.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a Mallard Duck!!!!");
    }
}
package app;
// Actual Implementations of Fly, where the duck can fly with wings.
public class FlyWithWings implements FlyBehavior{
    public void fly() {
        System.out.println("I fly.. With WINGS");
    }
}
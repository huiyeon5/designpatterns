package app;
// Actual Implementations of Fly, where the duck cannot fly at all.
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I cannot fly..");
    }
}
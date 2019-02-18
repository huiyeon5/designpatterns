package app;
// Actual Implementations of Quack where the duck actually Squeeks
public class Squeek implements QuackBehavior {
    public void quack() {
        System.out.println("Squeeking");
    }
}
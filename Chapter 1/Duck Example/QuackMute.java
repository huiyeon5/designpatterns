package app;
// Actual Implementations of Quack where the duck actually is mute.
public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("... Silence ...");
    }
}
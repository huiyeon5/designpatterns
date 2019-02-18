package app;
// Actual Implementations of Quack where the duck actually quacks
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quacking");
    }
}
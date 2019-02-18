package app;
public abstract class Duck {

    // They are not private as they will be implemented in the Child Classes of Duck
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // public Duck() {
        
    // }

    // To call the specific QuackBehaviors Quack. We dont need to know what kind of quack it is
    public void performQuack() {
        quackBehavior.quack();
    }
    
    // To call the specific FlyBehaviors Fly. We dont need to know what kind of fly it is
    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, no matter what kind of duck");
    }

    // Allows the changing of the Fly Behavior
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    
    // Allows the changing of the Quack Behavior
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();
}
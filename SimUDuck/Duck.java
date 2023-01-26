/* Testing the Duck Code 01-26-2023
*/



public abstract class Duck {
    FlyBehavior flyBehavior;    // Declare two reference variables for the behavior interface types. All duck subclasses(in the same package) inherit these. 
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(); //

    }

    public void performFly() {
        quackBehavior.quack();
    }

    public void swim() {
    System.out.printLn("All ducks float, even decoys!")
    }
}
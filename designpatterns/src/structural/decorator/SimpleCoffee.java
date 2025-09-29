package structural.decorator;

public class SimpleCoffee implements Coffee {
    public double cost() {
        return 5.0;
    }

    public String description() {
        return "Simple Coffee";
    }
}

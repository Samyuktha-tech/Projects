package structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 2.0;
    }

    public String description() {
        return coffee.description() + ", Milk";
    }
}

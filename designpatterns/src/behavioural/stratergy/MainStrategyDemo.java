package behavioural.stratergy;

public class MainStrategyDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        ContextSort context = new ContextSort();

        context.setStrategy(new BubbleSort());
        context.sort(numbers);

        context.setStrategy(new QuickSort());
        context.sort(numbers);
    }
}

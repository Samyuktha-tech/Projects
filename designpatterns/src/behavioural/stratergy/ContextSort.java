package behavioural.stratergy;

public class ContextSort {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] numbers) {
        strategy.sort(numbers);
    }
}

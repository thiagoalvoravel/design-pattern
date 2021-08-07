package strategy.sort.context;

import strategy.sort.ISortingStrategy;

public class StrategyContext {

    private ISortingStrategy iSortingStrategy;

    public void setiSortingStrategy(ISortingStrategy iSortingStrategy) {
        this.iSortingStrategy = iSortingStrategy;
    }

    public void sort(int[] numbers) {
        iSortingStrategy.sort(numbers);
    }

}

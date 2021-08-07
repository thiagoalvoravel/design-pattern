package strategy.sort;

import strategy.sort.context.StrategyContext;
import strategy.sort.impl.MergeSort;
import strategy.sort.impl.QuickSort;

public class SortApplication {

    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();

        strategyContext.setiSortingStrategy(new MergeSort());
        strategyContext.sort(new int[]{20, 5, 7, 18, 4, 52});

        strategyContext.setiSortingStrategy(new QuickSort());
        strategyContext.sort(new int[]{20, 5, 7, 18, 4, 52});
    }

}

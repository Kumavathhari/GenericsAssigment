package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumFinder<T extends Comparable<T>> {

    @SafeVarargs
    public final T findMaximum(T... values) {
        List<T> valueList = Arrays.asList(values);
        Optional<T> maxOptional = valueList.stream()
                .max(Comparable::compareTo);
        return maxOptional.orElse(null);
    }

    public static void main(String[] args) {
        MaximumFinder<String> stringFinder = new MaximumFinder<>();
        String result1 = stringFinder.findMaximum("Apple", "Peach", "Banana", "Orange");
        System.out.println("Test Case 1 Result: " + result1);

        MaximumFinder<Integer> integerFinder = new MaximumFinder<>();
        Integer result2 = integerFinder.findMaximum(10, 5, 7, 15, 3);
        System.out.println("Test Case 2 Result: " + result2);

        MaximumFinder<Double> doubleFinder = new MaximumFinder<>();
        Double result3 = doubleFinder.findMaximum(2.5, 1.2, 5.8, 4.0);
        System.out.println("Test Case 3 Result: " + result3);
    }
}


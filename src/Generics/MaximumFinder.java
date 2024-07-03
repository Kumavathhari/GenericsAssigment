package Generics;

public class MaximumFinder<T extends Comparable<T>>  {
    private T a;
    private T b;
    private T c;

    public MaximumFinder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return MaximumFinder.findMaximum(a, b, c);
    }

    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumFinder<String> stringFinder = new MaximumFinder<>("Apple", "Peach", "Banana");
        System.out.println("Test Case 1 Result: " + stringFinder.testMaximum());

        MaximumFinder<String> stringFinder2 = new MaximumFinder<>("Zebra", "Lion", "Elephant");
        System.out.println("Test Case 2 Result: " + stringFinder2.testMaximum());

        MaximumFinder<String> stringFinder3 = new MaximumFinder<>("Cat", "Dog", "Bear");
        System.out.println("Test Case 3 Result: " + stringFinder3.testMaximum());

        MaximumFinder<Integer> integerFinder = new MaximumFinder<>(10, 5, 7);
        System.out.println("Test Case 4 Result: " + integerFinder.testMaximum());

        MaximumFinder<Integer> integerFinder2 = new MaximumFinder<>(3, 8, 4);
        System.out.println("Test Case 5 Result: " + integerFinder2.testMaximum());

        MaximumFinder<Integer> integerFinder3 = new MaximumFinder<>(1, 2, 9);
        System.out.println("Test Case 6 Result: " + integerFinder3.testMaximum());
    }
}
package Generics;

public class MaximumFinder {
        public static void main(String[] args) {
            String result1 = findMaximum("Apple", "Peach", "Banana");
            System.out.println("Test Case 1 Result: " + result1);

            String result2 = findMaximum("Zebra", "Lion", "Elephant");
            System.out.println("Test Case 2 Result: " + result2);

            String result3 = findMaximum("Cat", "Dog", "Bear");
            System.out.println("Test Case 3 Result: " + result3);

            Integer result4 = findMaximum(10, 5, 7);
            System.out.println("Test Case 4 Result: " + result4);

            Integer result5 = findMaximum(3, 8, 4);
            System.out.println("Test Case 5 Result: " + result5);

            Integer result6 = findMaximum(1, 2, 9);
            System.out.println("Test Case 6 Result: " + result6);
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
    }
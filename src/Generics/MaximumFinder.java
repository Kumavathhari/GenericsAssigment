package Generics;

public class MaximumFinder {
    public static Integer findMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer result1 = findMaximum(5, 3, 2);
        System.out.println("Test Case 1.1 Result: " + result1);

        Integer result2 = findMaximum(3, 6, 2);
        System.out.println("Test Case 1.2 Result: " + result2);

        Integer result3 = findMaximum(3, 2, 7);
        System.out.println("Test Case 1.3 Result: " + result3);
    }
}

package Generics;

public class MaximumFinder {
        public static void main(String[] args) {

            String result1 = findMaximum("Apple", "Peach", "Banana");
            System.out.println("Test Case 1 Result: " + result1);


            String result2 = findMaximum("Zebra", "Lion", "Elephant");
            System.out.println("Test Case 2 Result: " + result2);


            String result3 = findMaximum("Cat", "Dog", "Bear");
            System.out.println("Test Case 3 Result: " + result3);
        }

        public static String findMaximum(String a, String b, String c) {
            String max = a;
            if (b.compareTo(max) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }
    }
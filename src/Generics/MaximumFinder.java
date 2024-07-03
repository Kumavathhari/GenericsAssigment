package Generics;

public class MaximumFinder {
    public static float findMax(float a, float b, float c) {
        float max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        float a1 = 3.5f, b1 = 7.2f, c1 = 5.1f;
        System.out.println("Test Case 1: " + findMax(a1, b1, c1));

        // Test Case 2
        float a2 = -1.0f, b2 = -5.4f, c2 = -3.3f;
        System.out.println("Test Case 2: " + findMax(a2, b2, c2));

        // Test Case 3
        float a3 = 0.0f, b3 = 0.0f, c3 = 0.0f;
        System.out.println("Test Case 3: " + findMax(a3, b3, c3));
    }
}

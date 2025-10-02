package com.dsa.Arrays;

public class ArrayProblem3 {
    public static int MaxHeight(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            // Width of container
            int width = right - left;

            // Height of container = smaller line
            int minHeight = Math.min(height[left], height[right]);

            // Current area
            int area = width * minHeight;

            // Update maximum
            max = Math.max(max, area);

            // Move the shorter line pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = MaxHeight(height);
        System.out.println("Maximum water contain : " +result);
    }
}

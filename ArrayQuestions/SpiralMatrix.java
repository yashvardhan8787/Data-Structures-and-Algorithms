package ArrayQuestions;

import java.util.Arrays;

public class SpiralMatrix {

    public static void printSpiral(int n) {
        int[][] arr = new int[n][n];
        int top = 0, left = 0, right = n - 1, bottom = n - 1;
        int count = 1;

        while (top <= bottom && left <= right) {
            // Fill top row (left to right)
            for (int i = left; i <= right; i++) {
                arr[top][i] = count++;
            }
            top++;

            // Fill right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count++;
            }
            right--;

            // Fill bottom row (right to left), if applicable
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = count++;
                }
                bottom--;
            }

            // Fill left column (bottom to top), if applicable
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = count++;
                }
                left++;
            }
        }

        // Print the matrix
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        printSpiral(3);
    }
}

import java.io.*;
import java.util.Arrays;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        int array[] = {90, 10, 1, 8, 30, 15, -2};
        double x = 50.4;
        double y = 8.5;
        int n = array.length;
        System.out.println("For an array = " + Arrays.toString(array));
        arrayRange(array, n);                                                   // TASK 1
        System.out.println("The smallest value is " + minimum(array, n)         // TASK 2
                + " and the second smallest value is  " + minimal(array, n));
        double result = quadraticFormula(x, y);                                  // TASK 3
        System.out.println("When x = " + x + " and y = " + y + ", x^2 + (4y/5 - x)^2 = " + result);

    }

    // Task 1: A Java implementation to find the Range = MAX(Number) - MIN(Number).

    // A function to calculate the minimum value from the array (TASK 1 & 2)
    static int minimum(int array[], int n) {
        int minValue = array[0]; // length must be at least 1.
        for (int i = 1; i < n; i++)
            minValue = Math.min(minValue, array[i]);
        return minValue;
    }

    // A function to calculate the maximum value from the array (TASK 1)
    static int maximum(int array[], int n) {
        int maxValue = array[0]; // length must be at least 1.
        for (int i = 1; i < n; i++)
            maxValue = Math.max(maxValue, array[i]);
        return maxValue;
    }

    // A function to yield the range. (TASK 1)
    static void arrayRange(int array[], int n) {
        int maxNumber = maximum(array, n);
        int minNumber = minimum(array, n);
        int range = maxNumber - minNumber;
        System.out.println("The range is  " + range);
    }

    // Task 2: A Java implementation to find the smallest value and the second-smallest value.

    //A function to obtain the second-smallest value (a minimal value). (TASK 2)
    public static int minimal(int array[], int whole) {
        int fleetingValue;
        for (int i = 0; i < whole; i++) {
            for (int j = i + 1; j < whole; j++) {
                if (array[i] > array[j]) {
                    fleetingValue = array[i];
                    array[i] = array[j];
                    array[j] = fleetingValue;
                }
            }
        }
        return array[1];//2nd smallest value (minimal value) since the index begins at 0.
    }

    // Task 3: A Java implementation to calculate a quadratic formula
    public static double quadraticFormula(double x, double y) {
        double result = Math.pow(x, 2) + Math.pow(4 * y / 5 - x, 2);
        return result;
    }


}
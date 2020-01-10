package javadev.basics;

import java.util.Arrays;

public class binarySearch {

    public static int findTarget(int[] arr, int target) {

        /*
        Please complete the coding questions using binary search.

        Search for the target in a sorted array, and return the index. If the target is not in this array, return -1.

        Example:

        Input: [1, 5, 7, 8, 9, 11, 18, 19, 20, 25], target=11, output=5.

        Input: [1, 2, 3, 4, 5], target=10, output=-1
        */


        //first - sort array
        Arrays.sort(arr);

        int lowestElement = 0;
        int highestElement = arr.length - 1;

        // first some input validation
        if(arr.length == 0) {
            return -1;
        }

        if(target < 0) {
            System.out.println("please define array with positive integers only");
            return -1;
        }


        //main logic
        while (lowestElement <= highestElement) {

            // low + high / 2 --> not acceptable because overflow when sum > 2^30
            int midElement = lowestElement + ((highestElement - lowestElement) / 2);

            int midValue = arr[midElement];

            if(midValue < target) {
                lowestElement = midElement + 1;
            } else if (midValue > target) {
                highestElement = midElement - 1;
            } else {
                System.out.println("target number found on index position:  " + midElement);
                return midElement;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int [] numbers = {7,5,6,4};
        findTarget(numbers, 4);

    }
}

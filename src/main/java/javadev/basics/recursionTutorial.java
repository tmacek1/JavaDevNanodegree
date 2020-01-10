package javadev.basics;

public class recursionTutorial {

    public static void printPermut(int[] arr, int index) {

            /*
            Write a permutation of [1, 2, 3] (permutation gives several possible variations, in which a set or number of things can be ordered or arranged).

            Give an array with unique integers, print all permutations.

            Example

            Input: [1, 2], print 12, 21

            Input: [1, 2, 3], print 123, 132, 213, 231, 312, 321.
            */

        if (arr.length == 0) {
            System.out.println("input array not valid");
        }

        if (index > arr.length) {
            System.out.println("invalid index");
        }

        if (arr.length == index + 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }

            System.out.println();

        } else {
            for (int i = index; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                printPermut(arr, index+1);
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4};
        printPermut(arr,0);

    }
}

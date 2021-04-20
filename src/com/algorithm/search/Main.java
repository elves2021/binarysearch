package com.algorithm.search;

public class Main {
    /**
     * Inrecursive call.
     * @param array the array
     * @param dest the dest value
     * @return the index of the dest in the array, otherwise -1
     */
    public static int binarySearch(int[] array, int dest) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) >>> 1;
            if (dest == array[middle]) {
                return middle;
            } else if (dest > array[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }

    /**
     * Recursive call.
     * @param array the array
     * @param start the start index
     * @param end the end index
     * @param dest the dest value
     * @return the index of the dest value in the array, otherise -1
     */
    public static int binarySearch(int[] array, int start, int end, int dest) {
        while (start <= end) {
            int middle = (start + end) >>> 1;
            if (dest == array[middle]) {
                return middle;
            } else if (dest > array[middle]) {
                return binarySearch(array, middle + 1, end, dest);
            } else {
                return binarySearch(array, start, middle - 1, dest);
            }
        }

        return -1;
    }


    public static void main(String[] args) {
	    // write your code here
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};

        int dest = 5;

        System.out.println("The index of " + dest + " is " + binarySearch(intArray, dest));
        System.out.println("The index of " + dest + " is " + binarySearch(intArray, 0, intArray.length - 1, dest));
    }
}

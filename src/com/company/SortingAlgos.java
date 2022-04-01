package com.company;

import java.util.Arrays;

public class SortingAlgos {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 5, 3, 9};

        // Bubble sort -> sorts numbers by comparing numbers
        // adjacent to it.
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length - 1 - i; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    // Create a temporary variable to hold the current value
//                    // at index j
//                    int temp = numbers[j];
//
//                    // Swap the numbers with each other
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(numbers));
        // Time complexity of the bubble sort is: O(n^2);


        // insertion sort
        // This algorithm sorts numbers by comparing the values at the indexes with the previous elements
        // to sort the elements.
        // we place the value at the index where there are no lesser values than that element.

//        for (int i = 1; i < numbers.length; i++) {
//            int valueToSort = numbers[i];
//            int j;
//            // The loop below is to store the numbers at the point
//            // where there are no less numbers than that value.
//            for(j = i; j > 0 && numbers[j - 1] > valueToSort; j--) {
//                numbers[j] = numbers[j - 1];
//            }
//
//            numbers[j] = valueToSort;
//        }
//        System.out.println(Arrays.toString(numbers));

        // time complexity for this is: O(n^2)


        // Selection sort
        // Find the minimum element
        // swap that minimum element with the current element
        // repeat the whole process until the array is fully sorted.

//        for (int i = 0; i < numbers.length; i++) {
//            int index = i; // current index of the number
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < numbers[index]) {
//                    index = j; // swap if number at position j less than the number at position index
//                }
//            }
//            int smallerNumber = numbers[index];
//            numbers[index] = numbers[i];
//            numbers[i] = smallerNumber;
//        }
//
//        System.out.println(Arrays.toString(numbers));

        int[] values = {3, 8, 3, 5, 9};
        mergeSort(0, values.length - 1, values);
        System.out.println(Arrays.toString(values));
    }


    public static void mergeSort(int start, int end, int[] numbers) {
        // Merge Sort
        // Divide the array into subarrays of about half size in each iteration/repetition
        // until each sub array has only one element
        // merge each subarray repeatedly to create sorted arrays. This is going to repeat itself
        // unitl we have only one sorted array. This is the sorted array.

        // Recursive method
        int mid = (start + end) / 2;

        if (start < end) {
            // sort the left half
            mergeSort(start, mid, numbers);

            // sort the right half
            mergeSort(mid + 1, end, numbers);

            // merge
            merge(start, mid, end, numbers);
        }

    }

    public static void merge(int start, int mid, int end, int[] numbers) {
        // Initialize a temp array and index
        int[] tempArray = new int[numbers.length];
        int tmpArrayIndex = start; // temporary index

        // initialize the start index and mid index to be used as counters
        int startIndex = start;
        int midIndex = mid + 1;

        // iterate until the smaller array reaches the end
        while (startIndex <= mid && midIndex <= end) {
            if (numbers[startIndex] < numbers[midIndex]) {
                // The ++ increases the value of the index by one
                // and is being used to keep the while loop from giving us an
                // infinite loop
                tempArray[tmpArrayIndex++] = numbers[startIndex++];
            } else {
                tempArray[tmpArrayIndex++] = numbers[midIndex++];
            }
        }

        // copy the remaining elements into the array
        while(startIndex <= mid) {
            tempArray[tmpArrayIndex++] = numbers[startIndex++];
        }

        while(midIndex <= end) {
            tempArray[tmpArrayIndex++] = numbers[midIndex++];
        }

        // copy the value of our temporary array into the actual array after we are
        // done sorting it.
        if (end + 1 - start >= 0) {
            // java method that can be used to copy an array
            System.arraycopy(tempArray, start, numbers, start, end + 1 - start);
        }
    }
 }

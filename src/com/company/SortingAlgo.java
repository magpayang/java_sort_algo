package com.company;

import org.jetbrains.annotations.NotNull;

public class SortingAlgo {
    public int[] BubleSort(int[] input_array){
        for (int idx = 0; idx < input_array.length - 1; ++idx){
            // loop for the number of passes
            // minimum number of passes = len - 1
            for (int jdx = 0; jdx < input_array.length - 1 - idx; ++jdx){
                // number of comparisons per pass
                // n = len -1 -idx
                if (input_array[jdx] > input_array[jdx+1]){
                    int temp = input_array[jdx+1];          // transfer to temp storage
                    input_array[jdx+1] = input_array[jdx]; // swap items
                    input_array[jdx] = temp;
                }
            }
        }
        return input_array;
    }
    public int[] SelectionSort(int @NotNull [] input_array){
        for (int idx = 0; idx < input_array.length - 1; ++idx){
            int current = 0;
            int current_idx = 0;
            int temp;
            // each loop represents a single pass
            // min number of pass = len - 1
            for (int jdx = 0; jdx < input_array.length - idx; ++jdx){
                // finding the largest item in the array
                if (input_array[jdx] > current){
                    current = input_array[jdx];
                    current_idx = jdx;
                }
            }
            temp = input_array[input_array.length - 1 - idx];   // temporary storage of last item
            input_array[input_array.length - 1 - idx] = current;    // swap
            input_array[current_idx] = temp;    // swap
        }
        return input_array;
    }
    public int[] InsertionSort(int [] input_array){
        for (int idx = 1; idx < input_array.length; ++idx){
            int current = input_array[idx];
            int current_index = idx;
            int increment=0;
            while(true){
                if (input_array[idx-1-increment]>current){
                    input_array[idx-increment]=input_array[idx-1-increment];
                    if (idx-1-increment==0){
                        input_array[idx-1-increment]=current;
                        break;
                    }else{
                        ++increment;
                    }
                }else{
                    input_array[idx-1-increment+1] = current;
                    break;
                }
            }

        }
        return input_array;
    }
    public int[] ShellSort(int[] input_array) {  // general form of insertion sort
        int[] gaps = {63, 33, 17, 9, 5, 3, 1};  // https://en.wikipedia.org/wiki/Thomas_N._Hibbard
        for (int gap : gaps) {
            for (int idx = gap; idx < input_array.length; ++idx) {
                int current = input_array[idx];
                int current_index = idx;
                int increment = 0;
                while ((idx - gap - increment >= 0) && (input_array[idx - gap - increment] > current) ) {
                    input_array[idx - increment] = input_array[idx - gap - increment];
                    increment += gap;
                }
                input_array[idx - gap - increment + gap] = current;
            }
        }
        return input_array;
    }
}

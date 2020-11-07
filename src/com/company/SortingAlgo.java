package com.company;

import javax.lang.model.type.NullType;

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
    public int[] SelectionSort(int [] input_array){
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
    public int[] merge(int[] left, int[] right){
        int[] result = {};

        ArrayFunctions obj0 = new ArrayFunctions();

        while(left.length != 0 && right.length != 0){
            if (left[0] <= right[0]){
                result = obj0.ArrayAppend(result, left[0]);
                left = obj0.ArraySlicer(left, 1, left.length);
            }else{
                result = obj0.ArrayAppend(result, right[0]);
                right = obj0.ArraySlicer(right, 1, right.length);
            }
        }

        while(left.length != 0){
            result = obj0.ArrayAppend(result, left[0]);
            left = obj0.ArraySlicer(left, 1, left.length);
        }

        while(right.length != 0){
            result = obj0.ArrayAppend(result, right[0]);
            right = obj0.ArraySlicer(right, 1, right.length);
        }

        return result;
    }
    public int[] merge_sort(int[] input_array) {
        if (input_array.length == 1) {
            return input_array;
        }
        int[] left;
        int[] right;
        ArrayFunctions obj0 = new ArrayFunctions();

        left = obj0.ArraySlicer(input_array, 0, input_array.length/2);
        right = obj0.ArraySlicer(input_array, input_array.length/2, input_array.length);

        left = merge_sort(left);
        right = merge_sort(right);

        return merge(left, right);
    }
}

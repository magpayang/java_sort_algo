package com.company;

public class ArrayFunctions {
    public int[] ArraySlicer(int[] input_array, int start_index, int end_index){
        int[] new_array = new int[end_index - start_index];

        for (int idx = 0; idx<new_array.length; ++idx, ++start_index){
            new_array[idx] = input_array[start_index];
        }

        return new_array;
    }

    public int[] ArrayAppend(int[] input_array, int item){
        int[] new_array = new int[input_array.length+1];

        for (int idx = 0; idx<input_array.length; ++idx){
            new_array[idx] = input_array[idx];
        }

        new_array[input_array.length] = item;

        return new_array;
    }

    public void temp(int[] a, int[] b){
        if(a[0] < b[0]){
            System.out.println(" a is less than b ");
        }else{
            System.out.println((" other wise "));
        }
    }
}

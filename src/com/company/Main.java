package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] my_array = {9,8,7,6,5,4,3,2,1,0};
//        int[] my_array = {0,9};
//        int[] my_array = {9,0};
//        int[] my_array = {0,0};
        int[] my_array = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(Arrays.toString(my_array) + " -- Original ");

        SortingAlgo obj0 = new SortingAlgo();

        my_array = obj0.ShellSort(my_array);
//        my_array = obj0.InsertionSort(my_array);

//        my_array = obj0.BubleSort(my_array);
//        System.out.print(Arrays.toString(my_array));
//        my_array = obj0.SelectionSort(my_array);
//        System.out.println(Arrays.toString(my_array));
//        my_array = obj0.SelectionSort(my_array);
//        System.out.print(Arrays.toString(my_array));

        System.out.print(Arrays.toString(my_array));
    }
}

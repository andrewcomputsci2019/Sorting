package com.company;

import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new Random().ints(25).toArray();
        Sorts[] sorts = new Sorts[3];
        sorts[0] = new BubbleSort(intArray.clone());
        sorts[1] = new insertionSort(intArray.clone());
        sorts[2] = new SelectionSort(intArray.clone());
        int[][] results = new int[3][intArray.length];
        int counter = 0;
        for (Sorts sort:sorts) {
            results[counter] = sort.sort();
        }
        boolean allMathc = true;
        for (int[] inner: results) {
            for(int i = 1; i< inner.length;i++){
                if(inner[i]>=inner[i-1]){
                    continue;
                }else{
                    allMathc = false;
                }
            }
        }
        System.out.println(allMathc);
    }
}

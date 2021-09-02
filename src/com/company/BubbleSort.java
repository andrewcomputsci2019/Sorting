package com.company;

import java.util.Arrays;

public class BubbleSort extends Sorts{
    private int[] array;
    public BubbleSort(int[] array){
        this.array = array;
    }
    public BubbleSort(){}

    /**
     *
     * @param array a mutable array
     * @return the mutated array in sorted order
     */
    @Override
    public int[] sort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for (int j=0; j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] sort() {
        if(array !=null){
            return this.sort(this.array);
        }else{
            return null;
        }
    }
}

package com.company;

public class insertionSort extends Sorts{

    private int[] array;
    public insertionSort(int[] array){
        this.array = array;
    }
    public insertionSort(){

    }


    @Override
    public int[] sort(int[] array) {
        for (int i=1; i<array.length;i++){
            int j = i-1;
            int key = array[i];
            while (j>=0&&array[j]>key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = key; // adds one to prevent out of bounds error;
        }
        return array;
    }

    @Override
    public int[] sort() {
        if(this.array!=null){
            return this.sort(this.array);
        }else{
            return null;
        }
    }
}

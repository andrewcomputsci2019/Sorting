package com.company;

public class SelectionSort extends Sorts{


    private int[] array;
    public SelectionSort(int[] array){
        this.array = array;
    }
    public SelectionSort(){

    }


    @Override
    public int[] sort(int[] array) {
        for(int i =0; i<array.length;i++){
            int min = array[i];
            int index = i;
            boolean allSameVal = true; // here for quick exit
            for(int j=i; j<array.length; j++){
                if(min>array[j]){
                    min = array[j];
                    index = j;
                    allSameVal = false;
                }
            }
            if(allSameVal){
                break;
            }
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }

    @Override
    public int[] sort() {
        if (this.array!=null){
            return sort(this.array);
        }else{
            return null;
        }
    }
}

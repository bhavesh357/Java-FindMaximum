package com.bl;

public class FindMaximum {

    public Integer getMaximum(Integer[] array){
        Integer max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }

    public Float getMaximum(Float[] array) {
        Float max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }

    public String getMaximum(String[] array) {
        String max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }
}

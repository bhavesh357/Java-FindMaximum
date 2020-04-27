package com.bl;

public class FindMaximum<X extends Comparable,Y extends Comparable,Z extends Comparable> {
    public X[] array1;
    public Y[] array2;
    public Z[] array3;

    public FindMaximum() {

    }

    public FindMaximum(X[] array1, Y[] array2, Z[] array3) {
        this.array1 = array1;
        this.array2 = array2;
        this.array3 = array3;
    }

    public <E extends Comparable> void testMaximum(){
        printMax(getMaximum(array1));
        printMax(getMaximum(array2));
        printMax(getMaximum(array3));
    }

    public static <E extends Comparable> E getMaximum(E[] array){
        E max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }

    public <E> void printMax(E e){
        System.out.println(e);
    }
}

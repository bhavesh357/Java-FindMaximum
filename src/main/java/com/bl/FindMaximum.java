package com.bl;

public class FindMaximum<E extends Comparable> {
    public E e1;
    public E e2;
    public E e3;

    public FindMaximum() {

    }

    public FindMaximum(E x1,E x2,E x3) {
        this.e1= x1;
        this.e2= x2;
        this.e3= x3;
    }

    public <E extends Comparable> void testMaximum(){
        printMax(getMaximum(e1,e2,e3));
    }

    public static <E extends Comparable> E getMaximum(E... eArray){
        E max = eArray[0];
        for(E e:eArray){
            if(e.compareTo(max)>0){
                max=e;
            }
        }
        return max;
    }

    public <E> void printMax(E e){
        System.out.println(e);
    }
}

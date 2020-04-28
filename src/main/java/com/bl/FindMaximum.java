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

    public static <E extends Comparable> E getMaximum(E e1,E e2,E e3){
        E max = e1;
        if(e2.compareTo(e3)>= 0 && e2.compareTo(e1)>=0){
            max = e2;
        }
        if(e3.compareTo(e1)>= 0 && e3.compareTo(e2)>=0){
            max = e3;
        }
        return max;
    }

    public <E> void printMax(E e){
        System.out.println(e);
    }
}

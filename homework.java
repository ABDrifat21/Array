package Linked;

import java.util.LinkedList;
import java.util.Scanner;

public class test {
    int size ;
    int [] array ;
    test(int size){
        this.size = size;
        array = new int[size];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

    }
    public void show(){
        for (int i:array)
            System.out.println(i);
    }
    public void insert(int data,int position){

        for (int pos = array.length-1;pos>position-1;pos--){
            array[pos] = array[pos-1];
        }
        array[position-1] = data;
    }
   public void delete(int position){
        for (int i = position-1;i<array.length-1;i++){
            array[i] = array[i+1];
        }
        int[] array2 = new int [size-1];
        for (int i = 0;i<array2.length;i++){
            array2[i] = array[i];
        }
        array = array2;
   }
   public void search(int value){
        for (int i :array){
            if (value==i) {
                System.out.println("Found");
                return;
            }
        }
       System.out.println("Not found");
   }
    public static void main(String[] args) {

        System.out.println("Enter size");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        test t = new test(5);
        t.insert(69,3);
        t.show();
        System.out.println("after");
        t.delete(2);
        t.show();


    }
}

package com.array;

/*Java program to find non-repeating elements in an array
        printing non repeating elements in an array in java programming language
        We are given with an array and need to print the distinct elements among them.
        You will found different methods to solve this problem in this page.*/

//Input : arr[8] = [10, 20, 40, 30, 50, 20, 10, 20]
  //      Output : 40 30 50

import java.util.Scanner;

public class ArrayRepeatingDistinct {

    static void calculation(){
        int[] arr ={10, 20, 40, 30, 50, 20, 10, 20};
        //nonrepetitive element
        int[] arrd = new int[8];
        int visited=-1;
        for (int i=0;i<arr.length;i++){
            int count =1;
            if (arrd[i]!=visited){
                for (int k=i+1;k<arr.length-1;k++){
                    if (arr[i] == arr[k]){
                        count++;
                        arrd[k]=visited;
                    }
                }
                arrd[i]=count;
            }
        }

        System.out.println("non repetive elemnt");
        for (int i=0;i<arrd.length;i++){
            if(arrd[i]==1){
                System.out.println(arr[i]);
            }
        }

        //repetitive element
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
    public static void main(String[] args) {
        calculation();


    }
}

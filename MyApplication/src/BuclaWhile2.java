package com.company;

public class BuclaWhile2 {
    public static void main (String[]artg){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = 0;
        do {
            System.out.println(arr[x]);
            x++;
        }
        while (x<arr.length);
    }
}

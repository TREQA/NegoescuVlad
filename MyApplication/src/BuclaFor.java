package com.company;

public class BuclaFor {
    public static void main (String[]artg){
        int[] arr = {1,2,-1,4,5,-1};
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==-1)
                arr1[i]=0;
            else
                arr1[i]=arr[i];
        }
        System.out.println(java.util.Arrays.toString(arr1));
    }
}

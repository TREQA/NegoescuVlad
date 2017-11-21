package com.company;

public class BuclaFor2 {
    public static void main(String[] artg) {
        String[][] users = {{"petar", "petrovic", "1111"},
                {"jovan", "jovanovic", "2222"}, {"zoran", "ivanovic", "3333"}
        };
        String[] names = new String[users.length];
        for(int i=0;i<users.length;i++)
            names[i]=users[i][0];
        System.out.println(java.util.Arrays.toString(names));
    }
}
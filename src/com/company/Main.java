package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(average(43,56,8,76,2,31));


    }

    public static int average(int...numbers){
        int total = 0;
        for(int x:numbers){
            total+=x;
        }
        return total/numbers.length;

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] initArray = {5,6,7,8};
        int[] copyArray = new int [4];
        for(int i=0;i<4;i++){
            copyArray[i]=initArray[i];
            System.out.println(copyArray[i]);
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // write your code here

        int[] array = {10, 4, 6, 7, 8, 6, 10, 0};
        System.out.println("In ra Mang: ");
        for (int j=0; j<array.length;j++) {
            System.out.print(array[j]+"\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int size = sizeArray(array, num);
        int[] newArray = new int[array.length - size];

        System.out.println("kich thuoc mang " + size);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != num) {
                if (i <= size) {
                    newArray[i] = array[i];
                } else {
                    continue;
                }
            }
        }
        for (int item :
                newArray) {
            System.out.print(item+"\t");
        }
    }
    public static int sizeArray(int[] array, int num) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                size++;
            }
        }
        return size;
    }
}
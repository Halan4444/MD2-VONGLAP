package TH3_MANG;

import java.util.Scanner;

public class BT6_TINHTONGCACSO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row of array: ");
        int row = scanner.nextInt();
        System.out.print("Enter Column of array: ");
        int col = scanner.nextInt();
        double [][] arrays = new double[row][col];
        for (int i=0; i < row; i++) {
            for (int j=0; j < col; j++) {
                System.out.println("Enter element " + (i + 1) + "_" + (j + 1) + " ");
                arrays[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Array elements: ");
        for (int i =0; i < row; i++) {
            for (int j =0; j < row; j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("Enter the column want to calculate (start at 0): ");
        int colSum = scanner.nextInt();
        int sum = 0;
        if (colSum  <0 || colSum> arrays.length) {
            System.out.println("Out of range!");
        } else {
            for (int i = 0; i < row; i++) {
                sum += arrays[i][colSum];
        }
            System.out.println("Sum of elements at column "+colSum+ " is "+sum);
    }
}
}

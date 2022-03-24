package TH3_MANG;

import java.util.Scanner;

public class BT4_TIMMAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row of array: ");
        int row = scanner.nextInt();
        System.out.println("Enter Col of array: ");
        int col = scanner.nextInt();

        double [][] arrays = new double[row][col];
        for (int i=0; i < row; i++) {
            for (int j=0; j<col; j++) {
                System.out.println("Enter element " + (i+1)+ " " + (j+1) + " ");
                arrays[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Array elements");
        for (int i =0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
        double max = 0;
        int indexRow = 0;
        int indexCol = 0;
        for (int i=0; i<row; i++)
            for (int j = 0; j < col; j++) {
                if (max < arrays[i][j]) {
                    max = arrays[i][j];
                    indexRow = i + 1;
                    indexCol = j + 1;
                }
            }
        System.out.println("Max value in Array is " + max + " at row "+indexRow+" column "+indexCol);

    }
}

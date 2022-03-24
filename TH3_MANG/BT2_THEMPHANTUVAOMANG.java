package TH3_MANG;

import java.util.Scanner;

public class BT2_THEMPHANTUVAOMANG {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,7,8,10,0,0,0,0};
        System.out.println("Property list: ");
        for (int j=0;j<numbers.length;j++) {
            System.out.print(numbers[j]+"\t");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index you want to insert: ");
        int indexInsert = scanner.nextInt();
        if (indexInsert <0 || indexInsert >= numbers.length - 1) {
            System.out.println("Can't input");
        }  else {
            System.out.println("Enter the number you want to insert: ");
            int insertNumber = scanner.nextInt();
            int temp = 0;
            for (int i = indexInsert; i<numbers.length; i++) {
                temp = numbers [i];
                numbers [i] = insertNumber;
                insertNumber = temp;
            }
            System.out.println("Property list: ");
            for (int j =0; j<numbers.length; j++) {
                System.out.print(numbers[j]+"\t");
            }
        }
    }
}

package TH4_HUONGDOITUONG2.STOPWATCH.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            System.out.println("Bắt đầu: " + stopWatch.getStartTime());
            System.out.println("\n Trước:");
            for (int value : randomNumber(array)) {
                System.out.print(value + " ");
            }
            System.out.println("\n Sau");
            for (int value : selectionSort(array)){
                System.out.print(value + " ");
            }
            stopWatch.end();
            System.out.println("Kết Thúc: " +stopWatch.getEndTime());
            System.out.println("Lượng thời gian đã trôi: "+stopWatch.getElapsedTime());
    }
    public static int [] selectionSort(int[]array) {
        int temp;
        for (int i=0; i<array.length-1;i++) {
            for (int j=i; j<array.length;j++) {
                if (array[j]<array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        } return array;
    }
    public static int[] randomNumber (int[]array) {
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*100000);
        } return array;
    }
}

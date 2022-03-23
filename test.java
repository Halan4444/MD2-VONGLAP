import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số lượng số nguyên cần in");
            int number = sc.nextInt();
            int N = 2;
            int count = 0;
            int checkcount = 0;
            while (count < number){
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        checkcount ++;
                        break;
                    }
                }
                if (checkcount == 0){
                    count++;
                    System.out.println(N);
                }
                checkcount = 0;
                N++;

            }

        }
    }

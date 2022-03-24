
package TH3_MANG;
import java.util.Scanner;

public class BT1_XOAPHANTUKHOIMANG {
    public static void main(String[] args) {
        int i, c;
        Scanner scanner = new Scanner(System.in);
        int[] A = {10, 4, 6, 7, 8, 6, 10, 0};
        int n = A.length;
        System.out.println("In ra Mang: ");
        for (int j=0;j<A.length;j++) {
            System.out.print(A[j]+"\t");
        }
        System.out.println();
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }
        n = c;  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}

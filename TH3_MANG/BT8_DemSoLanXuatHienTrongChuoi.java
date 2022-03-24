package TH3_MANG;

import java.util.Scanner;

public class BT8_DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        String string = "DoiVuiTheKhiTaLamChu";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);
        int count = 0;
        for (int i=0; i< string.length();i++) {
            if (c == string.charAt(i)) {
                count += 1;
            }
        }
        System.out.println("frequency of appearance of " + c + " in string is " + count);
    }

}

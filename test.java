package ss3_array_function.bai_tap.dem_so_lan_xuat_hien_ky_tu_trong_chuoi;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }
}
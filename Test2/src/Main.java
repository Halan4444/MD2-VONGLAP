
public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, -3, 2};
//        int[] arr1 = {};

        for (int i = 0; i < arr.length; i++) {
            String s[] = new String[arr.length];
            if (arr[i] < 0) {
                s[i] = "Dojo";
            }
            if (arr[i] > 0) {
                s[i] = String.valueOf(arr[i]);
            }
            System.out.println(s[i]);
        }

    }
}

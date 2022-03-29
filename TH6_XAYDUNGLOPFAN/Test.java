package TH6_XAYDUNGLOPFAN;

public class Test {
    public static int[] main(String[] args) {
        int[] arr = {-1,-3,2};
//        int[] arr1 = {};
        String a = "";
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<0){
                a += arr[i];
            }
            System.out.println(a);
        } return arr;
    }
}

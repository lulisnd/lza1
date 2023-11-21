package jishi3;



public class t6 {
    public static void main(String[] args) {
        int a = 0;
        int n = 5;
        int[] arr = new int[n];
        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 9;
        for (int i = 0; i < arr.length; i++) {
        if (i==0 ){
            int a1 = arr[1];
            for (int j = 1; j < arr.length; j++) {
               if (arr[j] > a1){
                   a1 = arr[i];
               }
            }
            a = a + arr[0] *a1 *1;
        }else if (i == arr.length-1){
            int a2 = arr[1];
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > a2){
                    a2 = arr[i];
                }
            }
            a = a + arr[i]*a2*1;
        }else {
            int a3 = arr[0];
            int a4 = arr[0];
            for (int j = 0; j < i + 1; j++) {
                if (arr[j] > a3){
                    a3 = arr[i];
                }
            }
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] > a4){
                    a4 = arr[i];
                }
            }
            a = a + arr[i]*a3*a4;
        }
        }
        System.out.println(a);
    }
}

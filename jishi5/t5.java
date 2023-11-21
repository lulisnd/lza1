package jishi5;

public class t5 {
    public static void main(String[] args) {
        int n = 0;
        int[] height = {0,1,6,4,5,0,2,3};
        for (int i = 0; i < height.length-1; i++) {
            if ( height[i]<= height[i+1]){
               n = n + height[i];
            }else {
                n = n + height[i+1];
            }
        }
        System.out.println(n);
    }
}

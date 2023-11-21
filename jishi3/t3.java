package jishi3;

public class t3 {
    public static void main(String[] args) {
      int n = 7;
      int sum = go(n);
      System.out.println("1!+2!+3!+...+" + n + "! = " + sum);
            }

            public static int go(int n) {
                if (n == 1) {
                    return 1;
                } else {
                    return n * w(n) + go(n-1);
                }
            }

            public static int w(int n) {
                if (n == 0 || n == 1) {
                    return 1;
                } else {
                    return n * w(n-1);
                }
            }
        }



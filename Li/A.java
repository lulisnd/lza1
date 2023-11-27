package Li;

import Li.B;

public class A {
    public static void main(String[] args) {
        B b1 = B.x;
        System.out.println(b1);

        B[] q1= B.values();
        B q2 = B.valueOf("x");
        System.out.println(q2.name());
        System.out.println(q2.ordinal());

    }
}

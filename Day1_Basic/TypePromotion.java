// Type Promotion 
/*
Type Promotion in Expressions 
1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.

2. If one operand is long, float or double the whole expression is promoted to long, float or double respectively.
*/

public class TypePromotion {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);

        byte a1 = 5;
        short b1 = 25;
        char c = 'a';
        int d = a1 + b1 + c;
        System.out.println(d);

        int x = 10;
        float y = 5.5f;
        long z = 1000;
        double d1 = 30;
        double ans = x + y + z + d1;
        System.out.println(ans);

        // Wrong statement in Java
        /*
        byte b = 5;
        b = b * 2;
        */

        // Right statement in Java
        /*
        byte b = 5;
        b = (byte)(b*2)
        */
    }
}

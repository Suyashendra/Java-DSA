// Type conversion / Widening / Implicit conversion.
/*
Conversion happens when:
a. type compatibile
b. destination type > source type

byte > short > int > float > long > double
 */
public class TypeConversion {
    public static void main(String args[]){
        int a = 1;
        long b = a;
        System.out.println(b);
        // long a = 1;
        // int b = a; will give error
    }
}

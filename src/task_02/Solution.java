package task_02;

import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(doubleExpression(0.1,0.2,0.3));
//        System.out.println(doubleExpression(BigDecimal.valueOf(0.1),BigDecimal.valueOf(0.2),BigDecimal.valueOf(0.3)));
        System.out.println(flipBit(11,2));
    }

    // a + b == c, a и b - double

    public static boolean doubleExpression(double a, double b, double c){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a + b: " + (a + b));
        System.out.println("c: " + c);

        double e = 0.0001; // устанавливает, на сколько маленькой должна быть разница между числами
        System.out.println("a + b - c: " + (a + b - c));
        System.out.println("e: " + e);
        System.out.println("abs(a + b): " + Math.abs(a + b));
        return a + b - c < e;

//        5.551115123125783E-17 = 5.551115123125783  -> 0.5551115123125783 -> 0.000000000000005551115123125783
//        1.0E-4 -> 0.0001
//        5E-2 -> 0.05 = 5 * (10^-2)
    }

    public static boolean doubleExpression(BigDecimal a, BigDecimal b, BigDecimal c){
        return a.add(b).compareTo(c) == 0;
    }


    public static int flipBit(int number, int bitIndex){
        return number ^ 1 << bitIndex-1;
    }
}

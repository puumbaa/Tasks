package task_01;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++){
            array[i] = ++array[i];
        }

        System.out.println(Arrays.toString(array)); // 2 3 4 5 6


        //  * {2,3,4,5,6}
        for (int x : array) {
            x = ++x;
        }
        System.out.println(Arrays.toString(array)); //

//        System.out.println(booleanExpression(true,false,false, false));
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d){
        int cnt = 0;
     /*   int k = cnt++; // 1) k = cnt ->  2) cnt = cnt + 1
        int w = ++cnt; // 1) cnt = cnt+1 -> 2) w = cnt*/
        boolean[] booleans = {a,b,c,d};

        for (boolean x : booleans) {
            if (!x) cnt++;
        }




        return (a && b || a && c || a && d || b && c || b && d || c && d ) && cnt == 2;

        // хотя бы 2 аргумента - true
        // && - умножение
        // // - сложение
    }
}

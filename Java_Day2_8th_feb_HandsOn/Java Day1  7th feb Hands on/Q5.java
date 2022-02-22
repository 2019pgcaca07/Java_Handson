Q5) Apply your own logic to print the given pattern using loop
1 2
1 3
2 1
2 1
3 2
3 3

Ans. package com.org.gen.day1;
public class Q5 {
    public static void main(String args[]) {
//        12
//        13
//        21
//        21
//        32
//        33

        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 3; j++) {
                if (i % 2 != 0) {
                    System.out.println(i+""+j);
                }else {
                    System.out.println(i+""+1);
                }
            }

        }
    }
}
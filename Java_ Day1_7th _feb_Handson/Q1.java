Q1) Print star pattern using for loop
****
***
**
*
Ans.
package com.org.gen.day1;
public class Q1 {
    public static void main(String args[])
    {
        int i,j;

        for (i = 4; i >= 1; --i)
        {
            for (j = 1; j <= i; ++j)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
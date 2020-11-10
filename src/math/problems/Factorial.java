package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         *Using recursion
         */

//        long n=5;
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter number");
//
//        n=sc.nextLong();
//
//        long f=Factorial.fact(n);
//
//        System.out.println("factorial="+f);
//    }
//
//    static long fact(long n)
//    {
//        if(n<=0)
//            return 1;
//
//        return Factorial.fact(n-1)*n;
//    }


    // Using for loop

    int number = 5;
    long fact = 1;
    int i = 1;
        while(i<=number)
    {
        fact = fact * i;
        i++;
    }
        System.out.println("Factorial of "+number+" is: "+fact);
}








//        int num = 5;
//        long factorial = multiplyNumbers(num);
//        System.out.println("Factorial of " + num + " = " + factorial);
//    }
//    public static long multiplyNumbers(int num)
//    {
//        if (num >= 1)
//            return num * multiplyNumbers(num - 1);
//        else
//            return 1;
    }



package com.pluralsightandreview;

public class JavaExercisesEasy {

    public static int sumOfTwo(int i, int j){
        return i + j;
    }

//    Calculates the factorial of a given number
    public static int factorial(int num){

        int factorial = 0;
        for (int i = 1; i <= num; i++)
//            return i * num;
//            System.out.println(factorial = i);
            factorial = num - i;

        return factorial * num ;
    }

    public static void main(String[] args) {

        int x = 1;
        while(x <= 5) {
            System.out.println("the value of x: " + x);
            x++;
        }

//        System.out.println(sumOfTwo(1,2));

        System.out.println(factorial(4));




    }
}

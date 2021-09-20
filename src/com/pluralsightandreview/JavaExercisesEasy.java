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

//        int x = 1;
//        while(x <= 5) {
//            System.out.println("the value of x: " + x);
//            x++;
//        }
//
//        for (int y = 1; y <= 5; ++y){
//            System.out.println("the value of y is: " + y);
//
//        }

        int container = 1;
        for (int z = 1; z <= 4; z++){
            container = container * z;
//            System.out.println("the value of z is: " + z);
//            System.out.println("container = " + container);
        }
            int totalSumContainer = container;
        System.out.println("the total sum of container is: " + totalSumContainer);

//        System.out.println(sumOfTwo(1,2));

//        System.out.println(factorial(4));




    }
}

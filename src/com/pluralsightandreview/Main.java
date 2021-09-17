package com.pluralsightandreview;

public class Main {


    static void doSomething() {
        System.out.println("Inside method");
        System.out.println("Still inside");
    }

    //    added an if statement
    static void showSum(float x, float y, int count) {
        if (count < 1)
            return;

        float sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
        return;
    }

    static double calculateInterest(double amt, double rate, int years) {
        double interest = amt * rate * years;

        return amt * rate * years;
    }

    static double[] produceInterestHistory(double amt, double rate, int years) {
        double[] accumulatedInterest = new double[years];
        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }

    //    The method called swap switches the position of two integers
//    static void swap(int i, int j){
//        int k = i;
//        i = j;
//        j = k;
//    }

    public static void main(String[] args) {

        int luckyNumber = 308;

        System.out.println(luckyNumber);
//        System.out.println("Before method call");
//        doSomething();
//        System.out.println("After method call");
//
//        if (args.length < 1)
//            System.out.println("No args provided");
//        else
//            for (String arg : args)
//                System.out.println(arg);
//        System.out.println(args.length);

//        showSum(7.5f, 1.4f, 0);

//        double result = calculateInterest(100d, 0.05d, 10);

//        System.out.println(result);


//        System.out.println("Hello, Walter");
//
        // Just a basic While Loop
//        int someValue = 5;
//        int factorial = 1;
//
//        while (someValue > 1) {
//
//
//            factorial *= someValue;
//            someValue--;
//        }
//        System.out.println(factorial);

//        int i = 1;
//        while (i < 10) {
//            System.out.println(i);
//            i *= 2;
//        }

        // Below a basic Do-while Loop

//        int iVal = 5;
//        do {
//            System.out.print(iVal);
//            System.out.print(" * 2 = ");
//            iVal *= 2;
//            System.out.println(iVal);
//        } while (iVal < 25);

        //  For Loop

//        for (int j = 1; j < 10; j *= 2) {
//            System.out.println(j);
//        }

//        Arrays an order collection of elements
//        float[] theVals = new float[3]; //--- array that holds three elements
//        theVals[0] = 10.0f;
//        theVals[1] = 20.0f;
//        theVals[2] = 15.0f;
//
////        float[] theVals = {10.0f, 20.0f, 15.0f}; //   <-- can assign elements this way as well
//        // to know how many elements in a array we use length
//        float sum = 0.0f; //--- will hold the new value of the sum of the elements in the array
//        for (int index = 0; index < theVals.length; index++) {
//            sum += theVals[index];
//            System.out.println(sum);
//        }
//
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {

                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }

            for (double currentResult : results)
                System.out.println(currentResult);
        } else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide and operation code and 2 numeric values");
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);

        double result = execute(opCode,leftVal,rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;

        }
        return result;
    }

/*          For-each Loop
               Executes a statement once for each array member, Handles getting collection length, Handles acccessing
               each value
* */

//        float[] someValues = { 20.0f, 21.0f, 10.0f};
//        float sum = 0.0f;
//
//        for (float currentVal : someValues){
//            sum += currentVal;
//        }
//        System.out.println(sum);


//    }

    Flight vaToCa = new Flight();

    }




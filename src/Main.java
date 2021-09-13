public class Main {
    static void doSomething(){
        System.out.println("Inside method");
        System.out.println("Still inside");
    }

    static void showSum(float x, float y, int count){
        float sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
    }
    public static void main(String[] args) {

        System.out.println("Before method call");
        doSomething();
        System.out.println("After method call");

        showSum(7.5f, 1.4f, 3);

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
//        float[] theVals = {10.0f,20.0f,15.0f}; //   <-- can assign elements this way as well
//        // to know how many elements in a array we use length
//        float sum = 0.0f; //--- will hold the new value of the sum of the elements in the array
//        for (int index = 0; index < theVals.length; index++){
//            sum += theVals[index];
//            System.out.println(sum);
//        }

//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals ={ 50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = { 'd', 'a' , 's', 'm'};
//        double[] results = new double[opCodes.length];
//
//        for(int i = 0; i < opCodes.length; i++) {
//            switch (opCodes[i]) {
//                case 'a':
//                    results[i] = leftVals[i] + rightVals[i];
//                    break;
//                case 's':
//                    results[i] = leftVals[i] - rightVals[i];
//                    break;
//                case 'm':
//                    results[i] = leftVals[i] * rightVals[i];
//                    break;
//                case 'd':
//                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
//                    break;
//                default:
//                    System.out.println("Invalid opCode: " + opCodes[i]);
//                    results[i] = 0.0d;
//                    break;
//            }
//        }
//        for (double currentResult : results)
//        System.out.println(currentResult);

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




    }
}

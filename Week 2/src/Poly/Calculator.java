package Poly;

public class Calculator {

    static String name = "Calculator";
//    static final double pi = 3.14159;


    public static int add(int a, int b){
        return a +b;

    }public static int multiply(int a, int b){
        return a * b;


    }
    @Overloading
    public static int add(int a, int b, int c){
        return a + b + c;

    }
    public static double add(double a, double b){
        return a + b;
    }

    public static int add(int [] numbers){
        int sum = 0;
        for( int i = 0; i < numbers.length; i ++){

        }
        return sum;
    }
    public static double add(double a, int b){
        return a + b;
    }

}


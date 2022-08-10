package Poly;

public class StaticExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator()    ;
        int result = calculator.add(20, 30);

        int result2 = calculator.multiply(10, 20);
        result2 = Calculator.multiply(10,20);
        System.out.println(result2);

        int result3 = Calculator.add(2,4);

        Calculator calc1 = new Calculator() ;
        Calculator calc2 = new Calculator();

//        calc1.pi = 6;
//        System.out.println(calc1.pi);
//        System.out.println(calc2.pi);
//        System.out.println(Calculator.pi);

    }
}

package Wednesday.ExceptionExample;

public class Main {
    public static void main(String[] args) {
        try{
            int x = 5/0;


        }catch(ArithmeticException e) {
            System.out.println("divide by 0");
            e.printStackTrace();

        }



    }
}

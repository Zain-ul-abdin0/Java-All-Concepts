import java.util.Scanner;

public class UncheckedExceptions {
        public  static void main(String[] args) throws UncheckedExceptionDivider {
            int number1, number2, result;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number 1: ");
            number1 = scanner.nextInt();
            System.out.println("Enter Number 2: ");
            number2 = scanner.nextInt();
            result = number1/number2;
            if(result == 3){
                throw new UncheckedExceptionDivider("The result is 3");
            }
            System.out.println(result);

        }
        public static class UncheckedExceptionDivider extends  RuntimeException{
            public UncheckedExceptionDivider (String message){
                super(message);
            }
        }
}

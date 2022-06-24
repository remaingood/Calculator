import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        while (true) {
            char operation = scanner.next().charAt(0);
            if (operation == '+') {
                int operand2 = scanner.nextInt();
                double result = addition(operand1, operand2);
                System.out.println(result);
                operand1 = (int) result;
            } else if (operation == '-') {
                int operand2 = scanner.nextInt();
                double result = subtraction(operand1, operand2);
                System.out.println(result);
                operand1 = (int) result;
            } else if (operation == '*') {
                int operand2 = scanner.nextInt();
                double result = multiplication(operand1, operand2);
                System.out.println(result);
                operand1 = (int) result;
            } else if (operation == '/') {
                int operand2 = scanner.nextInt();
                double result = division(operand1, operand2);
                System.out.println(result);
                operand1 = (int) result;
            } else if (operation == 's') {
                break;
            }
            else if (operation == 'C') {
                operand1 = 0;
                System.out.println(operand1);
            }else {
                System.out.println("Nepodderzhivaemaya operatsia");
            }
        }
    }

    public static double addition (double a, double b){
        return a + b;
    }

    public static double subtraction (double a, double b){
        return a - b;
    }

    public static double multiplication (double a, double b){
        return a * b;
    }

    public static double division (double a, double b){
        return a / b;
    }
}

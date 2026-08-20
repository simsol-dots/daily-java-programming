import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("CALCULATOR (num operator num) : ");
        String inputString = input.nextLine();
        Scanner scanner = new Scanner(inputString);
        double num1 = scanner.nextDouble();
        String op = scanner.next();
        double num2 = scanner.nextDouble();
        scanner.close();
        double result = switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
        System.out.println("Result: "+result);


//        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <=number  ; i++) {
                sum+=i;
            System.out.print(i + " + " );
        }
        System.out.printf("\b\b = " + sum);
    }
}

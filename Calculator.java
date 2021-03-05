package calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
        double num1 = 0.0, num2 = 0.0, sum = 0.0, sub = 0.0, multiple = 0.0, divide = 0.0, remainder = 0.0, power = 0.0;
        char operator = '\0';
        boolean wanttocontinue = true;
        char ch = '\0';
        Scanner scan = new Scanner(System.in);
        while (wanttocontinue) {
            System.out.print("Enter two numbers:\n ");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            System.out.println("Available operation\n"
                    + "1. Addition \n"
                    + "2. Subtraction \n"
                    + "3. Multiplication \n"
                    + "4. Division \n"
                    + "5. Remainder \n"
                    + "6. Power value \n"
                    + "7. Exit");
            System.out.print("Enter option number: ");
            operator = scan.next().charAt(0);
            switch (operator) {

                case '1':
                    sum = (num1 + num2);
                    System.out.println("result"+" "+"=\t" + sum);
                    break;

                case '2':
                    sub = (num1 - num2);
                    System.out.println("result"+" "+"=\t" + sub);
                    break;

                case '3':
                    multiple = (num1 * num2);
                    System.out.println("result"+" "+"=\t"  + multiple);
                    break;

                case '4':
                    divide = (num1 / num2);
                    System.out.println("result"+" "+"=\t" + divide);
                    break;

                case '5':
                    remainder = (num1 % num2);
                    System.out.println("result"+" "+"=\t" + remainder);
                    break;

                case '6':
                    power = Math.pow(num1, num2);
                    System.out.println("result"+" "+"=\t"  + power);
                    break;

                case '7':
                    System.exit(0);

                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("\nDo you want to continue?");
            System.out.print("Enter Y/N:: ");
            ch = scan.next().charAt(0);
            if (Character.toUpperCase(ch) != 'Y')
                wanttocontinue = false;

            System.out.println(); // space
        }

        System.out.println("Thank You.");
        scan.close();
    }

}

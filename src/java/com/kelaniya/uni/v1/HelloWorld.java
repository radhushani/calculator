package v1;

import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter mathematical expression(Add :'+',Sub: '-',Mul:'*'):");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();

        File file = new File("src/java/com.kelaniya.uni/number.txt");
        Scanner scan = new Scanner(file);
        String num1 = scan.next();
        String num2 = scan.next();


        System.out.println("Answer for your mathematical expression:");
        switch (symbol) {
            case "+" -> System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
            case "-" -> System.out.println(Integer.parseInt(num1) - Integer.parseInt(num2));
            case "*" -> System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
            default -> System.out.println("enter a correct symbol");
        }
    }
}

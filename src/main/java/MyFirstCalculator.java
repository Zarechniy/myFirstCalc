import java.util.Scanner;

public class MyFirstCalculator {
    public static void main(String[] args) {
        int number1;
        int number2;
        int answer;
        char calc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        System.out.println("Введите (+, -, *, /): ");
        calc = scanner.next().charAt(0);

        switch(calc) {
            case '+': answer = number1 + number2;
                break;
            case '-': answer = number1 - number2;
                break;
            case '*': answer = number1 * number2;
                break;
            case '/': answer = number1 / number2;
                break;
            default:  System.out.println("Что-то пошло не так! Введено некорректное значение");
                return;
        }
        System.out.println(number1 + " " + calc + " " + number2 + " = " + answer);
    }
}

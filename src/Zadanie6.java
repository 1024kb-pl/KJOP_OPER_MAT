import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        float  divideResult = firstNumber / (float) secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        int moduloResult = firstNumber % secondNumber;

        System.out.println("Wynik dodawania: " + sumResult);
        System.out.println("Wynik odejmowania: " + subtractResult);
        System.out.println("Wynik mnożenia: "+multiplyResult);
        System.out.println("Wynik dzielenia: " +divideResult);
        System.out.println("Wynik modulo: "+moduloResult);
    }
}

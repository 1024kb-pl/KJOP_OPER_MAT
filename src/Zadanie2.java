import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Podaj trzecia liczbe: ");
        int thirthNumber = scanner.nextInt();

        System.out.println("Podaj czwarta liczbe: ");
        int fourthNumber = scanner.nextInt();

        int firstSubtract = firstNumber - secondNumber - thirthNumber - fourthNumber;
        System.out.println("Wynik a-b-c-d: " + firstSubtract);

        int secondSubtract = firstNumber - secondNumber;
        System.out.println("Wynik a-b: " +secondSubtract);

        int thirthSubtract = secondNumber - thirthNumber;
        System.out.println("Wynik c-d: " +thirthSubtract);

        int fourthSubtract = firstNumber - fourthNumber;
        System.out.println("Wynik a-d: " +fourthSubtract);
    }
}

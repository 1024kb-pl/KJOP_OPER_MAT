import java.util.Scanner;

public class Zadanie1 {
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

        int firstSum = firstNumber+secondNumber+thirthNumber+fourthNumber;
        System.out.println("Wynik a+b+c+d: " +firstSum);

        int secondSum = firstNumber+secondNumber;
        System.out.println("Wynik a+b: " +secondSum);

        int thirthSum = secondNumber+thirthNumber;
        System.out.println("Wynik c+d: " +thirthSum);

        int fourthSum = firstNumber + fourthNumber;
        System.out.println("Wynik a+d: " +fourthSum);
    }
}

import java.util.Scanner;

public class Zadanie5 {
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

        int first = firstNumber % secondNumber % thirthNumber % fourthNumber;
        System.out.println("Wynik a%b%c%d: " + first);

        int second = firstNumber % secondNumber;
        System.out.println("Wynik a%b: " +second);

        int thirth = secondNumber % thirthNumber;
        System.out.println("Wynik c%d: " +thirth);

        int fourth = firstNumber % fourthNumber;
        System.out.println("Wynik a%d: " +fourth);
    }
}

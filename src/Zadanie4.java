import java.util.Scanner;

public class Zadanie4 {
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

        float first = firstNumber / (float) secondNumber / (float) thirthNumber / (float) fourthNumber;
        System.out.println("Wynik a/b/c/d: " + first);

        float second = firstNumber / (float) secondNumber;
        System.out.println("Wynik a/b: " +second);

        float thirth = secondNumber / (float) thirthNumber;
        System.out.println("Wynik c/d: " +thirth);

        float fourth = firstNumber / (float) fourthNumber;
        System.out.println("Wynik a/d: " +fourth);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CurrencyConverter();
    }

    public static void CurrencyConverter() {
        Scanner scan = new Scanner(System.in);
        double EUR = 1;       // Basiswert für Euro
        double USD = 1.09;    // Umrechnungswert für USD
        double RUB = 0.01;    // Umrechnungswert für RUB

        System.out.println("Currency Converter: Standardwert € | Mögliche Konvertierungen: $ & ₽ ");

        System.out.print("Betrag in Euro: ");
        double amountInEuro = scan.nextDouble();

        System.out.print("Zielwährung (USD/RUB): ");
        String targetCurrency = scan.next().toUpperCase();

        double convertedAmount = 0;
        switch (targetCurrency) {
            case "USD":
                convertedAmount = amountInEuro * USD;
                System.out.println(amountInEuro + " EUR sind " + convertedAmount + " USD.");
                break;
            case "RUB":
                convertedAmount = amountInEuro * RUB;
                System.out.println(amountInEuro + " EUR sind " + convertedAmount + " RUB.");
                break;
            case "EUR":
                convertedAmount = amountInEuro;
                System.out.println( amountInEuro +" EUR sind "+ convertedAmount + " EUR...? Haha, du Spaßvogel.");
            default:
                System.out.println("Ungültige Zielwährung. Bitte geben Sie USD oder RUB ein.");
                break;
        }
    }
}

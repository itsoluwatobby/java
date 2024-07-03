import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    private final byte MONTHS_IN_YEAR = 12;

    private int principal = 0;
    private double monthlyInterest = 0;
    private int numberOfPayments = 0;

    static {
        System.out.println("Class loaded");
    }


    public void annualCalculator() {
        System.out.println("\t\t\t\t\tAnnual Calculator");
        Scanner sc = new Scanner(System.in);

        this.principalValidator(sc);

        this.annualInterestValidator(sc);

        this.periodValidator(sc);

        double estimate = Math.pow((1 + monthlyInterest), numberOfPayments);
        double nominator = principal * (monthlyInterest * estimate);

        String mortgage = this.formatPrice(nominator / (estimate - 1));
        System.out.println("Mortgage: " + mortgage);
    }

    private void principalValidator(Scanner sc) {
        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = sc.nextInt();
            int MAX_PRINCIPAL = 1_000_000;
            int MIN_PRINCIPAL = 1_000;
            if (principal > MIN_PRINCIPAL && principal < MAX_PRINCIPAL) break;
            String minFormat = this.formatPrice(MIN_PRINCIPAL);
            String maxFormat = this.formatPrice(MAX_PRINCIPAL);
            System.out.println("Enter a number between " + minFormat + " and " + maxFormat);
        }
    }

    private void annualInterestValidator(Scanner sc) {
        while (true) {
            System.out.print("Annual Interest Rate: ");
            int PERCENT = 100;
            float annualInterest = sc.nextFloat();
            if (annualInterest > 1 && annualInterest < 30) {
                monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Annual Interest Rate must be between 1 and 30");
        }
    }

    private void periodValidator(Scanner sc) {
        while (true) {
            System.out.print("Period (Years): ");
            int period = sc.nextInt();
            if (period > 1 && period < 30) {
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Period must be between 1 and 30");
        }
    }

    private String formatPrice(double price) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(price);
    }
}

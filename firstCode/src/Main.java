import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Learning learning = new Learning();
//        learning.learningPeriod();
//        Exercise exercise = new Exercise();
//        exercise.exercise();
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        mortgageCalculator.annualCalculator();
    }
}

class Learning {
    public void learningPeriod() {
//        int temperature = 22;
//        boolean isWarm = temperature > 20;
//        System.out.println(isWarm);
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
//        int temperature = 32;
//        if (temperature > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("It's a hot day");
//        }
//        else if (temperature > 20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("Cold day");
//        int income = 120_000;
//        String className = income > 100_000 ? "First Class" : "Economy";
//        System.out.println(className);

        //  SWITCH STATEMENT
//        String role = "";
//        switch (role) {
//            case "admin":
//                System.out.println("You're an Admin");
//                break;
//            case "moderator":
//                System.out.println("You're a Moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
//        }

//        LOOPS

        String[] fruits = { "Apple", "Mango", "Orange" };
        for (String fruit : fruits) System.out.println(fruit); // for each loop
    }
}

class MortgageCalculator {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    final int MIN_PRINCIPAL = 1_000;
    final int MAX_PRINCIPAL = 1_000_000;

    int principal = 0;
    float annualInterest = 0;
    double monthlyInterest = 0;
    int period = 0;
    int numberOfPayments = 0;


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
            if (principal > MIN_PRINCIPAL && principal < MAX_PRINCIPAL) break;
            String minFormat = this.formatPrice(MIN_PRINCIPAL);
            String maxFormat = this.formatPrice(MAX_PRINCIPAL);
            System.out.println("Enter a number between " + minFormat + " and " + maxFormat);
        }
    }

    private void annualInterestValidator(Scanner sc) {
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = sc.nextFloat();
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
            period = sc.nextInt();
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

class Exercise {
    public void exercise() {
        System.out.print("FizzBuzz\nEnter number: ");
        Scanner sc = new Scanner(System.in);
        short userInput = sc.nextShort();
        if (userInput % 5 == 0 && userInput % 3 == 0) System.out.println("FizzBuzz");
        else if (userInput % 5 == 0) System.out.println("Fizz");
        else if (userInput % 3 == 0) System.out.println("Buzz");
        else System.out.println(userInput);
    }
}
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Exercise exercise = new Exercise();
        exercise.exercise();
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
        String role = "";
        switch (role) {
            case "admin":
                System.out.println("You're an Admin");
                break;
            case "moderator":
                System.out.println("You're a Moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}

class AnnualCalculator {
    public void annualCalculator() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner sc = new Scanner(System.in);

        System.out.print("Annual Calculator\nPrincipal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        double monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int period = sc.nextInt();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double estimate = Math.pow((1 + monthlyInterest), numberOfPayments);
        double nominator = principal * (monthlyInterest * estimate);

        String mortgage = NumberFormat.getCurrencyInstance(Locale.US).format(nominator / (estimate - 1));
        System.out.println("Mortgage: " + mortgage);
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
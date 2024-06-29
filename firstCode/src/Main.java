import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Annual Calculator\nPrincipal: ");
//        int principal = sc.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = sc.nextFloat();
//        double monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
//
//        System.out.print("Period (Years): ");
//        int period = sc.nextInt();
//        int numberOfPayments = period * MONTHS_IN_YEAR;
//
//        double estimate = Math.pow((1 + monthlyInterest), numberOfPayments);
//        double nominator = principal * (monthlyInterest * estimate);
//
//        String mortgage = NumberFormat.getCurrencyInstance(Locale.US).format(nominator / (estimate - 1));
//        System.out.println("Mortgage: " + mortgage);

        Learning learn =  new Learning();
        learn.learningPeriod();
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
        int temperature = 32;
        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("It's a hot day");
        }
        else if (temperature > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
    }
}
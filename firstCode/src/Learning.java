import java.util.Scanner;

public class Learning {
    public void learningPeriod() {
        int temperature = 22;
        boolean isWarm = temperature > 20;
        System.out.println(isWarm);
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

        if (temperature > 30) {
            System.out.println("It's a hot day");
            System.out.println("It's a hot day");
        }
        else if (temperature > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");
        int income = 120_000;
        String className = income > 100_000 ? "First Class" : "Economy";
        System.out.println(className);

//          SWITCH STATEMENT
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

//        LOOPS

        String[] fruits = { "Apple", "Mango", "Orange" };
        for (String fruit : fruits) System.out.println(fruit); // for each loop
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
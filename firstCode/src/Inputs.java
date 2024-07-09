import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        final int CONVERSATION_FROM_ASCII = 48;
//        try {
            System.out.println("Enter a number: ");
//            int val = System.in.read(); // reads only one character at a time
//            System.out.println(val - CONVERSATION_FROM_ASCII);

//            InputStreamReader reader = new InputStreamReader(System.in); // reads multiple lines at a time
//            BufferedReader buf = new BufferedReader(reader);

//            String input = buf.readLine();
//            try {
//                int res = Integer.parseInt(input);
//                System.out.println(res);
//            }
//            catch (NumberFormatException e) {
//                System.out.println(input);
//            }
//            buf.close();

//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        Scanner sc = new Scanner(System.in);
        int number;
        try {
                number = sc.nextInt();
                System.out.println(number);
            }
        catch (InputMismatchException e) {
            System.out.println("Must be a number");
        }
        sc.close();
    }
}

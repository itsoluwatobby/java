import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Try/catch with resources
public class TryCatch {
    public static void main(String[] args) {
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            String res = buf.readLine();
            System.out.println(res);
        }
        catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

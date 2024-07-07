class MyException extends ArithmeticException {
    public MyException() {}
    public MyException(String message) {
        super(message);
    }
}

public class Exceptions
{
    public static void main(String[] args) {
        int i = 5;
        int j = 42;

        try
        {
            j = 18 / i;
            if (i == 5) {
                throw new MyException("Not divisible by zero");
            }
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("General Exception thrown");
        }
        finally {
            System.out.println("I'm gonna run");
        }
        System.out.println("J is: " + j);
    }
}

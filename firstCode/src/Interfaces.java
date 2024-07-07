// INTERFACE:
// *Functional - Only one function,
// *Normal - as many functions as possible,
// *Marker - No functions

// functional interface
public interface Interfaces {
    void calculate(int a, int b);
}

class Master
{
    public static void main(String[] args) {
        Interfaces cal = (a, b) -> System.out.println(a + b);
        cal.calculate(125, 22);
    }
}

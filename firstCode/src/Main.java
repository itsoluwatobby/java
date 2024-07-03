
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

//        MortgageCalculator mortgageCalculator = new MortgageCalculator();
//        mortgageCalculator.annualCalculator();
//        Class.forName("MortgageCalculator");
        Calculator calc = new Calculator();
        int result = calc.add(5, 2, 3);
        int[] arr = new int[5];
        String name = "Oluwatobi";
        System.out.println(arr.length);
        System.out.println(name.length());

        StringBuffer sb = new StringBuffer("Sam");
        StringBuilder sbu = new StringBuilder("Matthew");
        System.out.println(sb.capacity());
    }
}

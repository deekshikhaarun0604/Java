public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 3.7));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
    }
}

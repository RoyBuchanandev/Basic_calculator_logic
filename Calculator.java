public class Calculator {

    // constructor
    public Calculator() {

    }

    // metodo add -> retorna suma de a + b
    public int add(int a, int b) {
        return a + b;
    }

    // metodo substract -> retorna reste de a - b
    public int substract(int a, int b) {
        return a - b;
    }

    // metodo multiply -> retorna resta de a * b
    public int multiply(int a, int b) {
        return a * b;
    }

    // metodo divide -> retorna reste de a / b
    public int divide(int a, int b) {
        return a / b;
    }

     // metodo modulo -> retorna reste de a % b
     public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(5, 7));
System.out.println(myCalculator.substract(45, 11));
System.out.println(myCalculator.multiply(2, 3));
System.out.println(myCalculator.divide(2, 3));
System.out.println(myCalculator.modulo(2, 3));
    }
}

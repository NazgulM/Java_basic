// a simple calculator
public class Calculator {

    //constructor
    public Calculator() {
        int a;
        int b;
    }
    //methods
    public int add(int a, int b){
        return a + b;
    }
    public int substract(int a, int b){;
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;

    }
    public int divide(int a, int b){
        return a / b;
    }
    public int modulo(int a, int b){
        return a % b;

    }

    public static void main(String[] args){

        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.substract(45,11));
        System.out.println(myCalculator.multiply(65,89));
        System.out.println(myCalculator.divide(611,56));
        System.out.println(myCalculator.modulo(1000,5));
    }

}
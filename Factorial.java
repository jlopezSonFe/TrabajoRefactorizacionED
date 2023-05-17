public class Factorial {
    public static void main(String[] args) {
        int numVeces = 5;
        int factorial = 1;
        for (int contador = 1; contador <= numVeces; contador++) {
            factorial = factorial * contador;
        }
        System.out.println("Factorial of " + numVeces + " is " + factorial);
    }
}


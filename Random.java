package refactor;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
		final int maximo  = 100;
		final int minimo  = 1;
        int randomNumber = (int) (Math.random() * (maximo) + minimo);
        Scanner entrada = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = entrada.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("You guessed it!");
            }
        } while (guess != randomNumber);
    }
}


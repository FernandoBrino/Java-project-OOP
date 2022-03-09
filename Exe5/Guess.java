package Exe5;

import java.util.Random;

public class Guess {
    private int shuffledNumber, guessedNumber;

    public void shuffle() {
        Random random = new Random();
        shuffledNumber = random.nextInt(100);
        System.out.println("Número sorteado = " + shuffledNumber);
    }

    public void guessNumber() {
        int i = 0;
        while(guessedNumber != shuffledNumber) {
            i += 1;
            Random random = new Random();
            guessedNumber = random.nextInt(100);
        }
        System.out.println("Você adivinhou, após " + i + " tentativas!!");
    }
}

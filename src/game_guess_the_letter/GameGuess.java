package game_guess_the_letter;

public class GameGuess {
    public static void main(String[] args) throws java.io.IOException{
        char letter, answer = 'J';

        System.out.println("The hidden letter between A and Z");
        System.out.println("Try to guess the letter ");
        letter = (char) System.in.read(); // Reading a character from the keyboard
        if (letter == answer) System.out.println("*** RIGHT ***");
        else System.out.println("*** WRONG ***");
    }
}

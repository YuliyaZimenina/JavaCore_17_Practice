package game_guess_the_letter;

public class GameGuess {
    public static void main(String[] args) throws java.io.IOException{
        char letter, ignore, answer = 'J';

        do {
            System.out.println("The hidden letter between A and Z");
            System.out.println("Try to guess the letter ");
            letter = (char) System.in.read(); // Reading a character from the keyboard
            //Remove all remaining characters from the input buffer
            do{
                ignore = (char) System.in.read();
            }while (ignore != '\n');
            if (letter == answer) System.out.println("*** RIGHT ***");
            else {
                System.out.println("*** WRONG ***");
                if (letter < answer) System.out.println("The hidden letter is located further down" +
                        " the alphabet");
                else System.out.println("The hidden letter is located closer in the alphabet");
                System.out.println("Try again! \n");
            }
        }while (answer != letter);
    }
}

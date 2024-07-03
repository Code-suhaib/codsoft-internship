import java.util.Random;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        int chances = 5;
        System.out.println("Hey! Welcome to the number game.");
        System.out.println("You have to guess the number. If you guess correctly, you will win.");
        System.out.println("You will get only " + chances + " chances. Best of luck!");
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int value = random.nextInt(100) + 1;
        
        for (int i = 0; i < chances; i++) {
            System.out.println("Enter your guess: ");
            int userGuess = sc.nextInt();
            
            if (userGuess == value) {
                System.out.println("You won!");
                sc.close();
                return;
            } else {
                if (Math.abs(userGuess - value) <= 5) {
                    System.out.println("Very close!");
                } else if (Math.abs(userGuess - value) <= 10) {
                    System.out.println("Close!");
                } else {
                    System.out.println("FAR!");
                }
                
                if (userGuess < value) {
                    System.out.println("The number is higher than your guess.");
                } else {
                    System.out.println("The number is lower than your guess.");
                }
            }
        }
        
        System.out.println("Sorry, you lost the game. The correct number was: " + value + ".");
        sc.close();
}
}

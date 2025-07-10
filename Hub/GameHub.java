package Hub;

import java.util.Scanner;

public class GameHub {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====== GAME HUB ======");
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Chess");
            System.out.println("3. Snake and Ladder");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            Game game = GameFactory.getGame(choice);
            if (game != null) {
                game.play();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
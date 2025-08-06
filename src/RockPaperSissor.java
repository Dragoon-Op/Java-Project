import java.util.Random;
import java.util.Scanner;

public class RockPaperSissor{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (rock, paper, or scissor): ");
        String player = scanner.nextLine().toLowerCase();

        String[] options = {"rock", "paper", "scissor"};
        Random random = new Random();
        String bot = options[random.nextInt(options.length)];

        System.out.println("Computer: " + bot);

        if (player.equals(bot)) {
            System.out.println("It's a Draw!");
        } else if (
                (player.equals("rock") && bot.equals("scissor")) ||
                        (player.equals("paper") && bot.equals("rock")) ||
                        (player.equals("scissor") && bot.equals("paper"))
        ) {
            System.out.println("Player Wins!");
        } else if (
                (bot.equals("rock") && player.equals("scissor")) ||
                        (bot.equals("paper") && player.equals("rock")) ||
                        (bot.equals("scissor") && player.equals("paper"))
        ) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("Invalid input. No winner.");
        }

        scanner.close();
    }
}

//        System.out.println("Enter your choise (Rock,Paper,Sissor: ");
//        role = scanner.next();
//        System.out.println(random.toString());
//        while (true){
//            System.out.println("Enter your choise :");
//            System.out.println(random);
//            if ()
//
//        }

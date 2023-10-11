import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("rock, paper, or scissors");
        String userInput = scanner.nextLine();

        String computerChoice = generateComputerChoice();

        System.out.println("Computer chose " + computerChoice);
        System.out.println("You chose " + userInput);

        String result = playGame(userInput, computerChoice);
        System.out.println(result);
    }

    public static String playGame(String userChoice, String computerChoice) {
        userChoice = userChoice.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        computerChoice = computerChoice.toLowerCase();

        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }


        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "You win!" : "Computer wins!";
            case "paper":
                return computerChoice.equals("rock") ? "You win!" : "Computer wins!";
            case "scissors":
                return computerChoice.equals("paper") ? "You win!" : "Computer wins!";
        }


        return "Invalid input"; // Handle cases of invalid input
    }

    public static String generateComputerChoice() {
        // Generate a random number (0, 1, or 2) to represent rock, paper, or scissors
        int random = (int) (Math.random() * 3);

        if (random == 0) {
            return "rock";
        } else if (random == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}

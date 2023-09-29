package Lesson14;
import java.util.Random;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        final int boardSize = 5;
        char[][] board = new char[boardSize][boardSize];
        boolean isGameOver = false;

        initializeBoard(board);
        placeTarget(board);

        System.out.println("All set. Get ready to rumble!");

        while (!isGameOver) {
            displayBoard(board);

            int row = getUserInput("Enter row (1-5): ", 1, boardSize);
            int col = getUserInput("Enter column (1-5): ", 1, boardSize);

            if (board[row - 1][col - 1] == 'X') {
                System.out.println("You have won!");
                isGameOver = true;
            } else {
                System.out.println("Miss!");
                board[row - 1][col - 1] = '*';
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-';
            }
        }
    }

    public static void placeTarget(char[][] board) {
        Random random = new Random();
        int targetRow = random.nextInt(board.length);
        int targetCol = random.nextInt(board[targetRow].length);
        board[targetRow][targetCol] = 'X';
    }

    public static void displayBoard(char[][] board) {
        System.out.println("  | 1 | 2 | 3 | 4 | 5 |");
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + 1 + " | ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }

    public static int getUserInput(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }
}

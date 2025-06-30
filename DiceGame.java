import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?\n> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int total = die1 + die2;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);

        if (total > 7) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }

        scanner.close();
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements Runnable {

    int classChoice = 0;
    int currentLevel = 0;
    Character player = new Character();
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Thread t = new Thread(new Game());
        t.start();

    }

    @Override
    public void run() {

        playerSetup(mainMenu());

        while (player.currentClass.getHealth() > 0 && currentLevel != 6) {
            Character enemy = new Character();
            enemy.currentClass = new StandardEnemy();
            System.out.println("You are thrust into combat!\n");

            Encounter encounter = new Encounter(player, enemy, userInput);
            while (enemy.currentClass.getHealth() > 0) {
                encounter.nextTurn();
            }

            if (encounter.getWinner() == 0) {
                currentLevel += 1;
                System.out.println(
                        "\nYou win! Onto the next fight\nYou are " + (6 - currentLevel) + " encounters from the boss.");
                pause();
                System.out.println("\033\143");
            } else {
                System.out.println("You were killed....\nHighest encounter reached: " + currentLevel + "/" + 6);
                break;
            }

        }

        System.out.println("");
    }

    public int mainMenu() {

        System.out.println("//////////////////////////////////////\n//////////////////////////////////////");

        System.out.println("" +
                "\t Welcome to [name] \n" +
                "\t Which class will you be?");

        System.out.println("//////////////////////////////////////\n//////////////////////////////////////");

        System.out.println("\n [1] Warrior\n [2] Mage");

        while (classChoice == 0 || classChoice > 2) {
            try {
                classChoice = userInput.nextInt();
                if (classChoice > 2) {
                    System.out.println("Please pick a class");
                    userInput.next();
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please use a valid choice");
                userInput.next();
            }
        }

        return classChoice;

    }

    // sets the players class
    public void playerSetup(int classChoice) {
        switch (classChoice) {

            // "\033\143" clears the console
            case 1:
                System.out.println("\033\143You picked Warrior! Crush them ALL! ");
                player.currentClass = new Warrior();
                break;
            case 2:
                System.out.println("\033\143You picked Mage! Blow them UP!");
                player.currentClass = new Mage();
                break;
        }

    }

    public void pause() {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
            userInput.nextLine();
        } catch (Exception e) {
        }
    }

}
import java.util.Scanner;

public class Encounter {

    Character player;
    Character enemy;
    Scanner userInput;
    int turn = 1;

    public Encounter(Character player, Character enemy, Scanner userInput) {
        this.userInput = userInput;
        this.player = player;
        this.enemy = enemy;
    }

    public void nextTurn() {

        switch (turn) {
            case 1:
                playerTurn();
            case 0:
                enemyTurn();
        }

    }

    public void playerTurn() {
        turn = 0;
        int selectedMove = 0;
        int damage = 0;
        System.out.println("\tIts your turn! Destroy them!");

        while (player.currentClass.getStamina() >= 1) {

            damage = 0;
            System.out.println("Enemy: " + enemy);
            System.out.println("\nYou: " + player);
            System.out.println(player.currentClass.getAttacks());

            selectedMove = userInput.nextInt();

            damage = player.currentClass.attack(selectedMove);

            if (damage == -1) {
                System.out.println("You do not have enough stamina to make that move");
                pause();
                clear();

            } else if (enemy.currentClass.takeDamage(damage) < 1) {
                System.out.println("killed");
                break;
            }

        }

        player.currentClass.endTurn();

    }

    public void enemyTurn() {
        turn = 1;

        System.out.println("enemyTurn");
        // int selectedMove = 0;

        // while (enemy.currentClass.getStamina() >= 1) {

        // }
    }

    public int getWinner() {
        if (player.currentClass.health >= 1 && enemy.currentClass.health < 1) {
            return 0;
        } else {
            return 1;
        }
    }

    // useful functions for console
    public void pause() {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
            userInput.nextLine();
        } catch (Exception e) {
        }
    }

    public void clear() {
        System.out.println("\033\143");
    }

}

public class StandardEnemy extends Classes {

    public StandardEnemy() {
        health = 60;
        stamina = 100;
    }

    public void endTurn() {
        stamina += 50;
    }

    public int attack(int selectedMove) {
        return smallStrike();
    }

    public int takeDamage(int damage) {
        health -= damage;
        return health;
    }

    public String getAttacks() {
        return "";
    }

    public void block() {
        // block 20 damage
        // take rest of stamina minimum 50
    }

    public int smallStrike() {
        stamina -= 25;
        return 20;
    }

}

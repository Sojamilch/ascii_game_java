public class Boss extends Classes {
    int health = 500;
    int stamina = 100;

    public int attack(int selectedMove) {
        return bigSmash();
    }

    public String getAttacks() {
        return "";
    }

    public void endTurn() {
        stamina = 100;
    }

    public int takeDamage(int damage) {
        health -= damage;
        return health;
    }

    public int bigSmash() {
        stamina -= 100;
        return 50;
    }

    public void block() {
        // block 100 damage
        // use all of stamina
    }
}

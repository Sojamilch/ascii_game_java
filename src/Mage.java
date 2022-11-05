public class Mage extends Classes {

    public Mage() {
        health = 50;
        stamina = 100;
    }

    public String getAttacks() {
        return "[1] ass blast";
    }

    public int takeDamage(int damage) {
        health -= damage;
        return health;
    }

    public int attack(int selectedMove) {
        return fireBall();
    }

    public void endTurn() {
        stamina = 100;
    }

    public int fireBall() {
        return 100;
    }

}

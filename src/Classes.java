abstract public class Classes {
    int health;
    int stamina;
    int maxStamina = 100;

    // common functions go here using runtime polymorphism

    abstract public String getAttacks();

    abstract public int attack(int selectedMove);

    abstract public void endTurn();

    abstract public int takeDamage(int damage);

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

}

public class Warrior extends Classes {

    int attackDamage; // Damage of the attack
    int staminaCost; // Stamina cost said attack

    public Warrior() {
        health = 110;
        stamina = 100;

    }

    // common function in all classes

    public int attack(int selectedMove) {

        switch (selectedMove) {
            case 1:
                return bigStrike();
            case 2:
                return smallStrike();
        }
        return 0;
    }

    public String getAttacks() {
        return "[1] Main Attack - 50 DMG - 50 STAM\n" +
                "[2] Small Attack - 10 DMG - 25 STAM";
    }

    public int takeDamage(int damage) {
        health -= damage;
        return health;
    }

    public String castHeal() {
        health += 25;
        return "You healed for 25, Health: " + health;
    }

    public void block() {
        // block 45 damage
    }

    public int bigStrike() {

        attackDamage = 20;
        staminaCost = 50;

        if (useStamina(staminaCost) == -1) {
            attackDamage = -1;
        }

        return attackDamage;
    }

    public int smallStrike() {

        attackDamage = 10;
        staminaCost = 25;

        if (useStamina(staminaCost) == -1) {
            attackDamage = -1;
        }
        return attackDamage;
    }

    public void endTurn() {
        stamina = 100;
    }

    public int useStamina(int staminaUsage) {
        if ((stamina - staminaUsage) < 0) {
            return -1; // Not enough stamina to attack
        } else {
            stamina -= staminaUsage;
            return 0;
        }
    }

}

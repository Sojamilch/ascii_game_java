public class Warrior extends Classes {

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

        if (useStamina(50) == -1) {
            return -1;
        }

        return 50;
    }

    public int smallStrike() {
        useStamina(25);
        return 10;
    }

    public void endTurn() {
        stamina = 100;
    }

    public int useStamina(int staminaUsage) {
        if ((stamina - staminaUsage) < 1) {
            return -1;
        } else {
            stamina -= staminaUsage;
        }
        return 0;
    }

}

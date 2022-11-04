public class Warriror {
    int health = 110;
    int stamina = 100;

    public String castHeal(){
        health += 25;
        return "You healed for 25, Health: " + health;
    }

    public void block(){
        //block 45 damage
    }

    public int bigStrike(){
        stamina -= 50;
        return 50;
    }

    public int smallDamage(){
        stamina -= 25;
        return 20;
    }

    public void endTurn(){
        stamina += 50;
    }

}

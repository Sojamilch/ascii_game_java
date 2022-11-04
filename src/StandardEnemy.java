public class StandardEnemy {
    int health = 60;
    int stamina = 100;

    public void endTurn(){
        stamina += 50;
    }

    public void block(){
        //block 20 damage
        //take rest of stamina minimum 50
    }

    public int smallStrike(){
        stamina -= 25;
        return 20;
    }

}

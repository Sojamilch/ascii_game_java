public class Boss {
    int health = 500;
    int stamina = 100;

    public int bigSmash(){
        stamina -= 100;
        return 50;
    }

    public void block(){
        //block 100 damage
        //use all of stamina
    }
}

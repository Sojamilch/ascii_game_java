public class StandardEncounter {

    StandardEnemy standardEnemy = new StandardEnemy();
    Warriror warriror = new Warriror();
    int turn = 1;

    public void currentTurn(){
        while(standardEnemy.health != 0 || warriror.health != 0){

        }

    }

    public void playerTurn(){
        turn = 1;
    }

    public void enemyTurn(){
        turn = 0;
    }




}

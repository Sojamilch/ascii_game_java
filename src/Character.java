public class Character {

    Classes currentClass;

    @Override
    public String toString() {
        return "\nHealth: " + currentClass.health +
                "\nStamina: " + currentClass.stamina;
    }

}

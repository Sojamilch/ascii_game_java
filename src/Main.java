public class Main {

    public static void main(String[] args) {

        mainMenu();

    }

    public static void mainMenu(){
        for(int i = 0; i < 2; i++) {
            System.out.println("//////////////////////////////////////");
        }
        System.out.println("" +
                "\t Welcome to [name] \n" +
                "\t Which class will you be?"
        );
        for(int i = 0; i < 2; i++) {
            System.out.println("//////////////////////////////////////");
        }

        System.out.println("\n [1] Warrior");
    }
}
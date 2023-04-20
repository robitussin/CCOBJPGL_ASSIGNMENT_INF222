public class App {

    static boolean iWillNotSmoke = true;
    static boolean iWillNotDrink = true;

    public static void main(String[] args) throws Exception {

        // Precondition 
        assert iWillNotSmoke == true: "Lagot ka sa nanay mo!"; 

        napasamasaBarkada();

        // Postcondition
        assert iWillNotDrink == true: "Lagot ka sa tatay mo!";

    }

    static void napasamasaBarkada(){
        iWillNotDrink = false;
    }

}

public class App {

    static boolean iWontDrink = false;
    static boolean iWontGetDrunk = true;

    public static void main(String[] args) throws Exception {
      
    
        App myApp = new App();

        // precondition
        assert iWontDrink == false: "Lagot ka paguwi mo!";
        
        myApp.inuman();

        // postcondition
        assert iWontGetDrunk == true: "Hindi ka makakauwi!";

        //System.out.println(iWontDrink);
    }

    void inuman(){
        iWontDrink = true;
        iWontGetDrunk = false;
    }


}
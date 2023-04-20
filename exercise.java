public class App {

    static boolean iWillReview = true;
    static boolean iWillPass = true;

    public static void main(String[] args) throws Exception {

        // precondition
        assert iWillReview == true : "Nanood kasi ako ng series mula hapon hanggang madaling araw";

        // method
        exam();

        // postcondition
        assert iWillPass == true : "Kasi hindi ka nag aral bago mag exam";
    }

    static void exam(){
        iWillPass = false;
        System.out.println("Its exam day!");
    }
}

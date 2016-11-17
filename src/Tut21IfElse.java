public class Tut21IfElse {
    public static void main(String[] args) {

        int age = 100;

        if (age >= 45) {
            System.out.println("You have everything");

        }else if (age >= 35) {
                System.out.println("Time for your first kid");
        }
        else if (age >= 25) {
            System.out.println("Time for your first marriage");
        }
        else if (age >= 15) {
            System.out.println("Time for your first love");
        } else {
            System.out.println("Time for your first beer");
        }

    }
}

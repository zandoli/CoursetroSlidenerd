import java.util.Scanner;

public class Tut55TakeInputFromUserScannerWhileLoop {
    public static void main(String[] args) {

        System.out.println("Enter numbers");
        Scanner scn = new Scanner(System.in);

        while(scn.hasNextInt()){
            int num = scn.nextInt();
            System.out.println(num);
            System.out.println("Enter -1 to exit");
            if(num == -1){
                break;
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut14SwitchStatement {
    public static void main(String[] args) throws IOException {

        //System.out.println("Day number?");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int day = Integer.parseInt(br.readLine());

        int day=5;
        switch (day) {
            case 1:
                System.out.println("It is a Sunday");
                break;
            case 2:
                System.out.println("It is a Monday");
                break;
            case 3:
                System.out.println("It is a Tuesday");
                break;
            case 4:
                System.out.println("It is a Wednesday");
                break;
            case 5:
                System.out.println("It is a Thursday");
                break;
            case 6:
                System.out.println("It is a Friday");
                break;
            case 7:
                System.out.println("It is a Saturday");
                break;
            default:
                System.out.println("Not a valid day");
                //break;
        }
    }
}

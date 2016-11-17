import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut26SwitchStatement2 {
    public static void main(String[] args) throws IOException {

        System.out.println("What was your grade?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int grade = Integer.parseInt(br.readLine());

        if(grade>100){
            System.out.println("Grades were between 0 and 100.  Try again.");

        }else{
            switch (grade) {
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:
                case 93:
                case 92:
                case 91:
                case 90:
                    System.out.println("You got an A!");
                    break;

                case 89:
                case 88:
                case 87:
                case 86:
                case 85:
                case 84:
                case 83:
                case 82:
                case 81:
                case 80:
                case 79:
                case 78:
                case 77:
                case 76:
                case 75:
                    System.out.println("You got a B!");
                    break;

                case 74:
                case 73:
                case 72:
                case 71:
                case 70:
                case 69:
                case 68:
                case 67:
                case 66:
                case 65:
                    System.out.println("You got a C!");
                    break;

                case 64:
                case 63:
                case 62:
                case 61:
                case 60:
                case 59:
                case 58:
                case 57:
                case 56:
                case 55:
                    System.out.println("You got a D!");
                    break;

                case 54:
                case 53:
                case 52:
                case 51:
                case 50:
                    System.out.println("You got an F!");
                    break;

                default:
                    System.out.println("You did not get the pass mark.  Better luck next time.");
                    //break;

            }
        }

    }
}

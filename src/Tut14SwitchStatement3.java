import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut14SwitchStatement3 {
    public static void main(String[] args) throws IOException {

        System.out.println("What was your grade?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int grade = Integer.parseInt(br.readLine());

        if(grade>100){
            System.out.println("Grades were between 0 and 100. Try that again.");
        }
        else{
            switch(grade/10) {
                case 10:
                case 9:
                    System.out.println("You got an A!");
                    break;
                case 8:
                    System.out.println("You got a B!");
                    break;
                default:
                    System.out.println("You got a C!");
            }
        }
    }
}

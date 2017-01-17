import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tut55TakeInputFromUserBufferedReader {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a number");

//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(num);
    }
}

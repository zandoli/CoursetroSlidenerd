import java.io.Console;

//to be run in console
public class Tut55TakeInputFromUserConsole {
    public static void main(String[] args) {
        System.out.println("Enter numbers");

        Console console = System.console();
        int num = Integer.parseInt(console.readLine());

        System.out.println(num);
    }
}

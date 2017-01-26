import javax.swing.*;
import java.util.ArrayList;

public class Tut57ArrayListEx {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a bunch of numbers");

        System.out.println(input);

        String[] inputs = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for(String item: inputs){
            //int value = Integer.parseInt(item);
            list.add(Integer.parseInt(item));
        }
        for(Integer i: list){
            System.out.println(i);
        }

    }
}

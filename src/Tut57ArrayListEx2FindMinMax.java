import javax.swing.*;
import java.util.ArrayList;

public class Tut57ArrayListEx2FindMinMax {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a bunch of numbers");

        System.out.println(input);

        String[] inputs = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        int sum=0;
        for (String item : inputs) {
            int value = Integer.parseInt(item);
            sum+=value;
            list.add(value);
        }
        int min = min(list);
        int max = max(list);
        JOptionPane.showMessageDialog(null, "Minimum = " + min +" Maximum = " + max+" Average = "+(double)sum/list.size());
    }

    private static int min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }return min;
    }

    private static int max(ArrayList<Integer> list){
        int max = list.get(0);
        for (int j = 1; j < list.size() ; j++) {
            if(list.get(j)>max){
                max=list.get(j);
            }
        }return max;
    }

}


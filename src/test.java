import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println("How many decimal places you prefer(6 or less)?");

        Scanner ch = new Scanner(System.in);
        String input =  ch.nextLine();

        Integer input1 = Integer.parseInt(input);

        if(input1<=6) {

            Float ans = 22 / 7f;
            String ans1 = ans.toString();

            int dec = ans1.indexOf('.');

            System.out.println(ans1.substring(0, dec + input1 + 1));
        }else{
            System.out.println("Try 6 or less decimal places");
        }

        /*if(ans1.charAt(dec+2) == 0){
            String ans2 = ans1.concat("0");
            System.out.println(ans2.substring(0, dec + input1 + 1));
        }else {
            System.out.println(ans1.substring(0, dec + input1 + 1));
        }
*/

        //System.out.println(input);



    }

}

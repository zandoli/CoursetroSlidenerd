import java.util.Scanner;

public class Tut44Methods {
    private static boolean isDivisibleBy(int no, int div) {
        return no % div == 0;
    }
    private static int isMultiplied(int no, int div) {
        return no*div;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the divisor?");
        //String sci = sc.nextLine();
        int divisor = Integer.parseInt(sc.nextLine());

        //int number = 175;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is the dividend?");
        //String sci1 = sc.nextLine();
        int dividend = Integer.parseInt(sc1.nextLine());

        //boolean result =isDivisibleBySeven(number);
        //System.out.println(result);
        System.out.println(isDivisibleBy(divisor, dividend));
        System.out.println(isMultiplied(divisor, dividend));

    }

}

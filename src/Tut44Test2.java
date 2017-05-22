import java.util.Scanner;

public class Tut44Test2 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("What is the length of the cube in cm?");

    Integer input = Integer.parseInt(in.nextLine());
        System.out.println("Area of 1 of the cube's sides is "+square(input)+" cm^2");
    System.out.println("Volume of the cube is: "+volumeOfCube(input)+" cm^3");
}
    private static double square(double length){
            return length*length;
            }
    private static double volumeOfCube(double length){
        return length*length*length;
        }
}
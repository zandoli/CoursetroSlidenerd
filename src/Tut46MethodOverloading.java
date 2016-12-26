public class Tut46MethodOverloading {
    public static void main(String[] args) {
        display(1);
        //display(1, 2);
        display("Hi there");
        display(1, 2.0);
        display(2.0, 1);

    }

    private static void display(int i, double v) {
        System.out.println(i +" "+v);
    }

    private static void display(double i, int v) {
        System.out.println(i +" "+v);
    }

    /*private static void display(int i, int i1) {
        System.out.println(i+" "+i1);
    }*/

    private static void display(String s) {
        System.out.println(s);
    }

    private static void display(int number) {
        System.out.println(number);
    }
}

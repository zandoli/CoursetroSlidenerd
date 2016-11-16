public class Tut9IncrementDecrementLogicalOperators {
    public static void main(String[] args) {
        int a = 13, b=9;
        int c = a++ * --b + b-- - --a;
        //13, a=14
        //13 * 8
        //104 + 8, b=7
        //104 + 8 - 13
        System.out.println(c);
    }
}

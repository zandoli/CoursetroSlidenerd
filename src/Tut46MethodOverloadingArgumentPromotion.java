public class Tut46MethodOverloadingArgumentPromotion {
    public static void main(String[] args) {
        display(1, 4);
        display1(1,4);
    }

    private static void display(int i, long i1) {
        System.out.println(i+" "+i1);
    }

    private static void display1(long i, int i1) {
        System.out.println(i+" "+i1);
    }
}

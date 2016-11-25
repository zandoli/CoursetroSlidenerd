public class Tut28ForLoop2 {
    public static void main(String[] args) {
        int n=15;
        for (int i = 1; i <= n; i+=2) {
            /*for (int k = 0; k < n/2 -i/2; k++) {
                System.out.print(" ");
            }*/
            for (int j = 0; j < i; j++) {
                System.out.print("*");

                /*System.out.print(i);
                System.out.println(j);*/
            }System.out.println();
        }
    }
}
public class Tut34BreakStatement2 {
    public static void main(String[] args) {
        kev:for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
                System.out.println(j);
                if(i==1){
                    break kev;
                }
            }
        }
    }
}

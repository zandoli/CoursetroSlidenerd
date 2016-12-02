public class Tut34BreakStatement {
    public static void main(String[] args) {
        int c=0; //count
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                c++;
            }
            if(c==6){
                break;
            }
        }
        System.out.println(c);
    }
}

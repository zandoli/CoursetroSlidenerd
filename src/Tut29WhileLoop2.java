public class Tut29WhileLoop2 {
    public static void main(String[] args) {

        boolean condition=true;
        int i =0;

        while(condition) {
            System.out.println("Hello World");
            i++;

            if(i==4){
                condition=false;
            }
        }
    }
}

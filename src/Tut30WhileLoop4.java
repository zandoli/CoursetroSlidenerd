public class Tut30WhileLoop4 {
    public static void main(String[] args) {
        int i=0;
        boolean condition = true;
        while(condition){
            System.out.println("Hello World");
            i++;
            if(i==10){
                condition = false;
            }
        }

    }
}

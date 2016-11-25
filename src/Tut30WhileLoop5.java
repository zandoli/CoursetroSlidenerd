public class Tut30WhileLoop5 {
    public static void main(String[] args) {
        int i=1;
        while(i<=3){
            int j=0;
            while (j<i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
        //System.out.println();
        /*while(i<=3){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }*/

        /*for(int i=1; i<=3;i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}

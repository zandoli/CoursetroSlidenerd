public class Tut46VariableScope2 {
    public static void main(String[] args) {

        int yayi = 100;
        for (int i = 0; i < 4; i++) {

            //System.out.println(i);

            int a = 44;
            for (int j = 0; j < 4; j++) {

                System.out.println(i);
                System.out.println(j);

                int b = 65;
                for (int k = 0; k < 4; k++) {

                    //System.out.println(i);
                    //System.out.println(j);
                    //System.out.println(k);

                    int c = 56;
                }
            }
        }
    }
}

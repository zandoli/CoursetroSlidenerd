public class Tut16RelationalOperators2 {
    public static void main(String[] args) {
        int myAge = 26;
        int yourAge = 18;

        boolean res = myAge == yourAge;
        //System.out.println(res);

        //if (res == false){
            //System.out.println(myAge);
        //}

        double num1 = 0.7 + 0.1;
        double num2 = 0.9 - 0.1;

        int res1 = Double.compare(num2,num1);

        System.out.println(num1);
        System.out.println(num2);
        //System.out.println(num1==num2);
        System.out.println(res1);

    }
}

public class Tut44Test {
    public static void main(String[] args) {

        int w =add(6, 5);
        System.out.println(w);

        int x = subtract(6,5);
        System.out.println(x);

        int y = multiply(6,5);
        System.out.println(y);

        int z = divide(6,5);
        System.out.println(z);

    }
    public static int add(int a, int b){

        int add = a+b;
        return add;
    }
    public static int subtract(int a, int b){

        int subtract = a-b;
        return subtract;
    }
    public static int multiply(int a, int b){

        int multiply = a*b;
        return multiply;
    }
    public static int divide(int a, int b){

        int divide = a/b;
        return divide;
    }
}

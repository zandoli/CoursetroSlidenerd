public class Tut20IncrementDecrementLogicalOperators2 {
    public static void main(String[] args) {
        int myAge = 26;
        int yourAge = 27;

        System.out.println(myAge>18 && yourAge>18);
        System.out.println(myAge>108 && yourAge>18);
        System.out.println(myAge>18 || yourAge>108);
        System.out.println(myAge>108 || yourAge>108);

        System.out.println(!(myAge>30));
        System.out.println(!(myAge<30));
    }
}

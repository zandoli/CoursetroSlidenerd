public class Tut18AssignmentOperators2 {
    public static void main(String[] args) {
        int age = 26, newAge = 4;

        //newAge = newAge + age;
        //System.out.println(newAge);

        //newAge += age;
        //System.out.println(newAge);

        //newAge -= age;
        //System.out.println(newAge);

        age /= newAge;
        System.out.println(age);

        age -= newAge;
        System.out.println(age);

    }
}

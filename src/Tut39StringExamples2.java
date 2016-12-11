public class Tut39StringExamples2 {
    public static void main(String[] args) {
        String s1 = "Hello from Vaughn";

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(16));

        char ch = s1.charAt(16);
        System.out.println(ch);

        for (int i = 0; i < s1.length(); i++) {
            //char ch1 = s1.charAt(i);
            System.out.println(s1.charAt(i));
        }

        System.out.println(s1.indexOf('V'));
        System.out.println(s1.indexOf('F'));
        System.out.println(s1.indexOf('l', 3));

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String s2 = s1.substring(5);
        System.out.println(s2);

        String s3 = s1.substring(5, 11);
        System.out.println(s3);

    }
}

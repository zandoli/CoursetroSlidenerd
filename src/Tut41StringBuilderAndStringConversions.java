public class Tut41StringBuilderAndStringConversions {
    public static void main(String[] args) {
        String s1 = "Hello From ";
        String s2 = s1.concat("Vaughn");

        StringBuilder sb = new StringBuilder("Hello From ");
        sb.append("Vaughn!");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.insert(0, "Wopoo ");
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);

        sb.replace(0, 5, "Wassaaaap");
        System.out.println(sb);

        int num = 1024;
        String text = String.valueOf(num);
        System.out.println(text);

        System.out.println(text.substring(0,1));

        int num1 = 4380;
        String text1 = String.valueOf(num1);
        System.out.println(text1);

        String num2 = "1234";
        int no = Integer.parseInt(num2);



    }

}

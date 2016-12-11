public class Tut38StringExamples {
    public static void main(String[] args) {
        String s1="";
        System.out.println(s1.length());

        String s2=null;
        //System.out.println(s2.length());

        if (s2 !=null){
            System.out.println(s2.length());
        }else{
            System.out.println("You have a null string");
        }
        String s3 = "Hello from";
        String s4 = " Vaughn";

        String s5 = s3 + " " + s4;

        System.out.println(s5);

        String s6 = s3.concat(s4);
        System.out.println(s6);

        String s7 = "Hello";
        String s8 = "Hello";
        String s9 = "hEllo";
        String s10 = new String("Hello");

        System.out.println(s7 == s8);
        System.out.println(s7 == s10);
        System.out.println(s7 == s9);

        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s10));
        System.out.println(s7.equals(s9));
        System.out.println(s7.equalsIgnoreCase(s9));

        String s11 = "\"hello man\""; //escape sequence
        System.out.println(s11);

        String s12 = "\n\"hello man\""; //add new line
        System.out.println(s12);

        String s13 = "\t\"hello man\""; //add tab
        System.out.println(s13);

        String s14 = "\n\"hello man\"\n"; //new lines
        System.out.println(s14);
    }
}

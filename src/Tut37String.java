public class Tut37String {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str);
        str = str + " World";
        System.out.println(str);
        str += "!";
        System.out.println(str);
        str = str.concat(" Again");
        System.out.println(str);

        System.out.println(str.indexOf('l'));

        System.out.println(str.charAt(4));

        System.out.println(str.substring(6,11));

        System.out.println(str.contains("w"));

        System.out.println(str.length());

        String str1= "    Hello World! Again    ";
        System.out.println(str1);

        if (str.equals(str1)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        String t = str1.trim();
        System.out.println(t);

        String joined = String.join(",", "make", " break");
        System.out.println(joined);

        String str2 = "";
        System.out.println(str2);

        if(str2 != null && !str2.isEmpty()){
            System.out.println("Not empty");
        }
        else{
            System.out.println("Is empty");
        }
    }
}

public class Tut41Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("OpenPilot");

        System.out.println(sb.length());

        sb.replace(0, 4, "Ardu");

        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.delete(0,4));

        System.out.println(sb.insert(0,"Ardu"));


        //String s = "";

        for (int i = 1; i < 100; i++) {
            String s = "editText"+ i;
            System.out.println(s);

        }
        //String s2 = "";
        for (int i = 1; i < 100; i++) {
            String s2 = "nameValue"+ i;
            System.out.println(s2);
        }

        StringBuilder s3 = new StringBuilder("nameValuec");

        for (int i = 1; i < 100; i++) {
            s3.replace(9,12, i+"c");
            System.out.println(s3);
        }
        StringBuilder s4 = new StringBuilder("editTextc");

        for (int i = 1; i < 100; i++) {
            s4.replace(8,12, i+"c");
            System.out.println(s4);
        }
        StringBuilder s5 = new StringBuilder("editTextp");

        for (int i = 1; i < 100; i++) {
            s5.setLength(8);
            s5.insert(8,i+"p");
            System.out.println(s5);
        }
    }
}

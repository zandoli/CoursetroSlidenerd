public class Tut36ContinueStatement {
    /*public static void main(String[] args) {
        calc();
        print();
        calls();
    }*/
    static void calc(){
        for (int i = -10; i < 10; i++) {
                if(i==0){
                    continue;
                }
            System.out.println(100/i);
        }
    }
    static void greet(String name ){
        System.out.println("Hello "+name);
    }
    static int sum(int val, int val2){
        return val + val2;
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int min(int a, int b) {
        if(a < b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String args[]){
        calc();
        greet("Vaughn");

        //int x= sum(2,3);
        //System.out.println(x);
        //sum(2,3);
        System.out.println(sum(2,3));
        System.out.println(min(7,4));
        System.out.println(max(6, 10));
    }
}

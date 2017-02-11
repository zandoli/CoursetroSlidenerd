public class Tut59CallByValueVsCallByReference {
    public static void main(String[] args) {
        int original = 10;
        Square1 o = new Square1();
        o.side = 10;

        System.out.println("Before modifying "+original);
        modify(original);
        System.out.println("After modifying "+original);

        System.out.println("Before modifying "+o.side);
        System.out.println(o.getArea());
        modify(o);
        System.out.println("After modifying "+o.side);
        System.out.println(o.getArea());
    }

    public static void modify(int number){
        number = 1000;
    }

    public static void modify(Square1 object){
        object.side = 1000;
    }}

class Square1{
    double side;

    public double getArea(){
        return side*side;
    }
}

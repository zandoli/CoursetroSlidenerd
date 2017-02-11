public class Tut61Constructors {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(20, 40);
        Rectangle1 r2 = new Rectangle1(10, 30);

        System.out.println(r.getArea());
        System.out.println(r2.getArea());
    }
}

class Rectangle1{
    double length;
    double breadth;

    Rectangle1(double l, double b){
        length = l;
        breadth = b;
    }
    public double getArea(){return length * breadth;}
}
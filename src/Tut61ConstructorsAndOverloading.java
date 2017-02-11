public class Tut61ConstructorsAndOverloading {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2();
        Rectangle2 r2 = new Rectangle2(10, 30);

        System.out.println(r.getArea());
        System.out.println(r2.getArea());
    }
}

class Rectangle2{
    double length;
    double breadth;

    Rectangle2(){
        length = 8.0;
        breadth = 3.0;
    }

    Rectangle2(double l, double b){
        length = l;
        breadth = b;
    }
    public double getArea(){return length * breadth;}
}


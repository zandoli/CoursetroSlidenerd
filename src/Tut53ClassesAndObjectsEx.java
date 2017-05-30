import java.util.Scanner;

public class Tut53ClassesAndObjectsEx {
    public static void main(String[] args) {
/*      Square sq = null;
        sq = new Square();
        sq.side = 3;

        Square sq2 = new Square();
        sq2.side = 9;

        System.out.println(sq.calculateArea());
        System.out.println(sq2.calculateArea());*/

        /*for (int i = 1; i <= 10 ; i++) {
            Square sq = new Square();
            sq.side=i;

            System.out.println(sq.calculateArea());
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the square?");
        double side = sc.nextDouble();

        Square sq = new Square();
        System.out.println(sq.calculateArea(side));

        for (int i = 1; i <= 10 ; i++) {
            Rectangle rec = new Rectangle();
            rec.side1 = i;
            rec.side2 = 4;

            System.out.println(rec.calculateArea1());
        }
        for (int i = 1; i <= 10 ; i++) {
            Triangle tr = new Triangle();
            tr.side3 = i;
            tr.side4 = 5;

            System.out.println(tr.calculateArea2());
        }
    }
}
class Square{
    double calculateArea(double side) {
        return side * side;
    }
}
class Rectangle{
    double side1;
    double side2;
    double calculateArea1(){
        return side1*side2;
    }
}
class Triangle{
    double side3;
    double side4;
    double calculateArea2(){
        return 0.5*side3*side4;
    }
}

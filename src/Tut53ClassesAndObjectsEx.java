public class Tut53ClassesAndObjectsEx {
    public static void main(String[] args) {
//        Square sq = null;
//        sq = new Square();
//        sq.side = 3;
//
//        Square sq2 = new Square();
//        sq2.side = 9;

//        System.out.println(sq.calculateArea());
//        System.out.println(sq2.calculateArea());

        for (int i = 1; i <= 10 ; i++) {
            Square sq = new Square();
            sq.side = i;

            System.out.println(sq.calculateArea());
        }

        for (int i = 1; i <= 10 ; i++) {
            Rectangle rec = new Rectangle();
            rec.side1 = i;
            rec.side2 = 4;

            System.out.println(rec.calculateArea1());
        }
    }
}

class Square{
    double side;

    double calculateArea(){
        return side*side;
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

}

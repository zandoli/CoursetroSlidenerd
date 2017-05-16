public class test {
    public static void main(String[] args) {
        //int[] numbers;
        //numbers = new int[10];
        //numbers[5] = 8; //methodA

        //int[] scores= {10,9,8,6,7}; //methodB
        double sum=0;

        int[] numbers = {34,25,56,77,65,17,48,81};
        for (int number : numbers) {
            sum += number;
            System.out.println(number);
        }System.out.println(sum);
    }
}

public class Tut48ArraysExample5 {
    public static void main(String[] args) {
        int[] numbers = {34,25,56,77,65,17,48,81,90,69};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }
        /*for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }*/
        System.out.println(sum);
        System.out.println((double)sum/ numbers.length);
    }
}

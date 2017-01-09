public class Tut48ArraysExample3 {
    public static void main(String[] args) {
        int[] numbers = {34,25,56,77,65,17,48,81,90,69};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }
}

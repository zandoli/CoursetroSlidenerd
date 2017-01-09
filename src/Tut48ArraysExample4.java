public class Tut48ArraysExample4 {
    public static void main(String[] args) {
        int[] numbers = {34,25,56,77,65,17,48,81,90,69};

        int min = minimum(numbers);
        int max = maximum(numbers);

        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }

    private static int minimum(int[] numbers) {
        int min = -1;

        if(numbers!=null){
            min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        return min;
    }

    private static int maximum(int[] numbers) {

        int max = -1;

        if(numbers!=null) {
            max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
        }
        return max;
    }
}

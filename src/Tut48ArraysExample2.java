import java.util.Arrays;

public class Tut48ArraysExample2 {
    public static void main(String[] args) {
        int[] numbers = {34,25,56,77,65,17,48,81,90,69};

        //int[] series = new int[numbers.length]; //modification of one will not affect the other
        //System.arraycopy(numbers,0,series,0,numbers.length);

        int[] series = Arrays.copyOf(numbers,numbers.length);

        series[0] = 98;
        System.out.println(series[0]);
        System.out.println(numbers[0]);
    }
}

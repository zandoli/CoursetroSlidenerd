public class test {
    public static void main(String[] args) {
        //int[] numbers;
        //numbers = new int[10];
        //numbers[5] = 8; //methodA

        //int[] scores= {10,9,8,6,7}; //methodB

        int[] numbers = {34,25,56,77,65,17,48,81};
        double sum=0;
        for (int number : numbers) {
            sum += number;
            //System.out.println(number);
        /*int[] numbers1 = {34,25,56,77,65,17,48,81};
        double sum1=0;

        for(int x=0; x<numbers1.length;x++){
            sum1 += numbers1[x];*/
        }System.out.println(sum);
        //System.out.println(sum1);
    }

}

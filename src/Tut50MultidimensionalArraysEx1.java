public class Tut50MultidimensionalArraysEx1 {
    public static void main(String[] args) {
        //int[][] numbers = new int[3][3];
        int[][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,0},
                {10,11,12}
        };

        int sum = 0;
        int amt = 0;
        int min = numbers[0][0];
        int max = numbers[0][0];

        for (int r = 0; r < 4; r++) {

            int l = numbers[r].length;
            amt = amt + numbers[r].length;

            for (int i = 0; i < l; i++) {

                if(numbers[r][i] < min){
                    min = numbers[r][i];
                }
                if(numbers[r][i] > max){
                    max = numbers[r][i];
                }
                sum = sum + numbers[r][i];
                System.out.print(numbers[r][i]+" ");

            }//System.out.print(numbers[r].length);
            System.out.println();
        }System.out.println();
        System.out.println(sum);
        //System.out.println(amt);
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }
}

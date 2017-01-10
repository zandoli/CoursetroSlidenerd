public class Tut50MultidimensionalArraysEx2 {
    public static void main(String[] args) {
        //int[][] numbers = new int[3][3];
        int[][] numbers = {
                {1, 2,3},
                {4, 5, 6},
                {7, 8, 0},
                {10, 11, 12}
        };
        display(numbers);
        total(numbers);

    }

    private static int[][] display(int[][] numbers) {
        for (int r = 0; r < 4; r++) {

            int l = numbers[r].length;

            for (int i = 0; i < l; i++) {
                System.out.print(numbers[r][i] + " ");
            }
            System.out.println();
        }
        return numbers;
    }

    private static int total(int[][] numbers) {

        int sum = 0;
        for (int r = 0; r < 4; r++) {

            int l = numbers[r].length;

            for (int i = 0; i < l; i++) {
                sum = sum + numbers[r][i];
            }
        }System.out.println(sum);
        return sum;
    }
}





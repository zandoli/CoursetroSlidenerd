public class sololearn {
    public static void main(String[] args) {
        double[][] primes={{2.85,3.00,5.98},{7.98,11.28}};
        //System.out.println(primes.length);
        double sum=0;

        for (int i = 0; i < primes.length; i++) {
            for (int j = 0; j < primes[i].length; j++) {
                sum+=primes[i][j];
            }
        }System.out.println(sum);
    }
}

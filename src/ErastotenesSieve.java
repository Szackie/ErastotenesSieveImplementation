import java.util.ArrayList;

class ErastotenesSieve {

    static ArrayList<Integer> erastotenesSieve(int max) {
        int[] tab = new int[max + 1];

        for (int i = 1; i <= max; i++)
            tab[i] = i;

        var primes = new ArrayList<Integer>();

        int p = 2;

        while (p < max) {

            primes.add(p);
            tab[p] = 0;
            int k = p;
            while (p * k <= max) {

                tab[p * k] = 0;
                k++;
            }
            while (p < max && tab[p] == 0)
                p++;
        }
        return primes;
    }

    public static void main(String[] args) {

        System.out.println(erastotenesSieve(100));


    }

}

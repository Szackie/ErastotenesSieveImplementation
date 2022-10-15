import java.util.ArrayList;

class ErastotenesSieve {

    static ArrayList<Integer> erastotenesSieve(int max) {
        int[] tab=new int[max+1];
        for (int i = 1; i <= max; i++)
            tab[i]=i;

        for (int j = 2; j <= max; j++) {
            int k = 2;
            while (j * k <= max) {

                tab[j*k]=0;
                k++;
            }
        }
        var primes=new ArrayList<Integer>();
        for(int i=2;i<max+1;i++){
            if(tab[i]!=0)
                primes.add(tab[i]);
        }
        return primes;
    }

    public static void main(String[] args) {

        System.out.println(erastotenesSieve(100));


    }

}

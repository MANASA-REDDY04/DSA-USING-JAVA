package Advance_Maths;
import java.util.*;

public class SmallestPrimeFactorisation {
    static int MAX = 1000000;
    static int[] spf = new int[MAX + 1];


    public static void sieve() {
        for (int i = 1; i <= MAX; i++) {
            spf[i] = i;
        }

        for (int p = 2; p * p <= MAX; p++) {
            if (spf[p] == p) { // p is prime
                for (int i = p * p; i <= MAX; i += p) {
                    if (spf[i] == i) {
                        spf[i] = p; // Assign the smallest prime factor
                    }
                }
            }
        }
    }

    // Function to get prime factorization of a number using SPF
    public static List<Integer> getPrimeFactors(int x) {
        List<Integer> factors = new ArrayList<>();
        while (x != 1) {
            factors.add(spf[x]);
            x /= spf[x];
        }
        return factors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precompute SPF up to MAX
        sieve();

        System.out.print("Enter a number to find its prime factorization: ");
        int num = sc.nextInt();
        sc.close();

        List<Integer> primeFactors = getPrimeFactors(num);
        System.out.println("Prime Factorization: " + primeFactors);
    }
}

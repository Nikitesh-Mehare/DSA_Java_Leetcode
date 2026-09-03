class Solution {
    public List<List<Integer>> findPrimePairs(int n) {


        // Step 1: Precompute primes using Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Find valid (x, y) pairs
        List<List<Integer>> result = new ArrayList<>();
        for (int x = 2; x <= n / 2; x++) {
            int y = n - x;
            if (isPrime[x] && isPrime[y]) {
                result.add(Arrays.asList(x, y));
            }
        }

        return result;
        // List<List<Integer>> result = new ArrayList<>();
        
        // // Base case: No prime pairs can sum to a number less than 4
        // if (n < 4) {
        //     return result;
        // }
        
        // // Step 1: Sieve of Eratosthenes to find all primes up to n
        // boolean[] isPrime = new boolean[n + 1];
        // Arrays.fill(isPrime, true);
        // isPrime[0] = false;
        // isPrime[1] = false;
        
        // for (int p = 2; p * p <= n; p++) {
        //     if (isPrime[p]) {
        //         for (int i = p * p; i <= n; i += p) {
        //             isPrime[i] = false;
        //         }
        //     }
        // }
        
        // // Step 2: Find pairs (x, y) such that x + y = n and x <= y
        // for (int x = 2; x <= n / 2; x++) {
        //     if (isPrime[x]) {
        //         int y = n - x;
        //         if (isPrime[y]) {
        //             result.add(Arrays.asList(x, y));
        //         }
        //     }
        // }
        
        // return result;

    }
}
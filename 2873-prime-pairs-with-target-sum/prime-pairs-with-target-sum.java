class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Base case: No prime pairs can sum to a number less than 4
        if (n < 4) {
            return result;
        }
        
        // Step 1: Sieve of Eratosthenes to find all primes up to n
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Step 2: Find pairs (x, y) such that x + y = n and x <= y
        for (int x = 2; x <= n / 2; x++) {
            if (isPrime[x]) {
                int y = n - x;
                if (isPrime[y]) {
                    result.add(Arrays.asList(x, y));
                }
            }
        }
        
        return result;

    }
}
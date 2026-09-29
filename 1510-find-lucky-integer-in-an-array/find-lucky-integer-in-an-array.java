class Solution {
    public int findLucky(int[] arr) {

        // int count[] = new int[501];

        // for(int x : arr)
        // {
        //     count[x]++;
        // }

        // for(int i=500; i>=1; i--)
        // {
        //     if(i == count[i])
        //     {
        //         return i;
        //     }
        // }
        // return -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int luckyInteger = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luckyInteger = key; 
            }
        }
        return luckyInteger;
    }
}
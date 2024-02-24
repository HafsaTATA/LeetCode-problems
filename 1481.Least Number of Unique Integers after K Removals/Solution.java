class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // we sort the hashmap
        int[] values = new int[frequencyMap.size()];
        int i = 0;
        for (Integer value : frequencyMap.values()) {
            values[i++] = value;
        }
        Arrays.sort(values);
        i = -1;
        do {
            i++;
            k -= values[i];
        } while (k > 0);

        if (k == 0) {
            return values.length - i - 1;
        } else
            return values.length - i;
    }
}

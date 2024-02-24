class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> frequencyMap=new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue()>nums.length/2)
                return entry.getKey();
        }
        return -1;
    }
}

class Solution {
    
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int prefixSum = 0;
    
        m.put(0,1);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            if(m.containsKey(remove)){
                count += m.get(remove);
            }
            m.put(prefixSum, m.getOrDefault(prefixSum,0) + 1);
        }
        return count;
    }
}
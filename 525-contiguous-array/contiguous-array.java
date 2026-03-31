
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        int SubArrayLength = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += (nums[i] == 0) ? -1 : 1;
            if(sum ==0){
                SubArrayLength = i+1;
            }
            else if(m.containsKey(sum)){
                SubArrayLength = Math.max(SubArrayLength, i-m.get(sum));

            }
            else{
                m.put(sum,i);
            }
        } 
        return SubArrayLength;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int ans = n + 2; // Acts as "infinity" since max possible length is n
        
        for (int i = 0, left = 0; i < n; i++) {
            sum += nums[i];
            
            // Shrink the window from the left as much as possible
            while (sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }
        
        return ans == n + 2 ? 0 : ans;
    }
}
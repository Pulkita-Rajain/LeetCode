class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];

        // Generate all possible subarrays
        for (int i = 0; i < nums.length; i++) {

            int product = 1;

            for (int j = i; j < nums.length; j++) {

                product = product * nums[j];

                // Update maximum product
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }
}
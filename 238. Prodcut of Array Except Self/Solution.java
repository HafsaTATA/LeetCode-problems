class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroExist = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroExist++;
            }
        }

        if (zeroExist >= 2) {
            Arrays.fill(nums, 0);
        } else if (zeroExist == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = prod;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}

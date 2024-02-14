class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        int count = 0;
        int n = nums.length;
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == 0) {
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[c] = nums[i];
                c++;
            }
        }
        for (int k = c; k < n; k++) { // k=c se start krna not a complex logic
            nums[k] = 0;
        }
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int array[] = {1,2,3,4,5,6,7,9,10};
        target = 8;
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return left;
    }
}
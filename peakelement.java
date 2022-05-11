A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

  
  
  class Solution {
  public int findPeakElement(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      final int mid = left + (right - left) / 2;
      if (nums[mid] >= nums[mid + 1])
        right = mid;
      else
        left = mid + 1;
    }

    return left;
  }
}
 

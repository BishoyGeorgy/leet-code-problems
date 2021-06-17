class RotateArray {
  
    // Solution using extra memory (New Empty Array)
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k >= length) k %= length;
        if (k == 0) return;
        int nums2[] = new int[length];
        
        for (int i = 0; i < length; i++) {
            if (i + k < length) {
                nums2[i + k] = nums[i];
            
            } else {
                int index = Math.abs(length - k - i);
                nums2[index] = nums[i];
            }
        }
    }
  
  // Another Solution using swap
  // Reversing first part on the Array using the swap method
  // Reversing second part on the Array using the swap method
  // Reversing the whole Array using the swap method then we have the array rotated
  public void rotateInPlace(int[] nums, int k) {
        int length = nums.length;
        if (k >= length) k %= length;
        if (k == 0) return;
        
        // {1, 2, 3, 4, 5, 6, 7}
        reverse(nums, 0, length - k - 1); // --> {4, 3, 2, 1, 5, 6, 7}
        reverse(nums, length - k, length - 1); // --> {4, 3, 2, 1, 7, 6, 5}
        reverse(nums, 0, length - 1);  // --> {5, 6, 7, 1, 2, 3, 4}
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
  
    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;        
    }
}

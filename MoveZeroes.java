class MoveZeroes {
    // input: {0,1,0,3,12} -- lastNonZero = 0;
    
    // 1st For Loop:
    // 1st i ==> {1,1,0,3,12} -- lastNonZero = 1;
    // 2nd i ==> {1,3,0,3,12} -- lastNonZero = 2;
    // 3rd i ==> {1,3,12,3,12} -- lastNonZero = 3;
    // There's no non-zeroes values remains
    
    // 2nd For Loop:
    // 1st i ==> {1,3,12,3,0}
    // 2nd i ==> {1,3,12,0,0}
    public void moveZeroesInPlace(int[] nums) {
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) if (nums[i] != 0) nums[lastNonZero++] = nums[i];
        for (int i = nums.length - 1; i >= lastNonZero; i--) nums[i] = 0;
    }
    
    // input: {0,1,0,3,12}
    
    // 1st For Loop:
    // 1st i ==> {1,0,0,0,0}
    // 2nd i ==> {1,3,0,0,0}
    // 3rd i ==> {1,3,12,0,0}
    // There's no non-zeroes values remains
    
    // 2nd For Loop: Copy Values from nums2 to nums
    public void moveZeroesWithExtraSpae(int[] nums) {
        int[] nums2 = new int[nums.length];
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) if (nums[i] != 0) nums2[lastNonZero++] = nums[i];
        for (int i = 0; i < nums.length; i++) nums[i] = nums2[i];
    }
}

class SingleNumber {
    // Solution using sorting
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) return nums[i];
        }
        
        return 0;
    }
  
  
    // Another Solution using Math
    // 2 * (a + b + c) - (a + a + b + b + c) = c
    public int singleNumberUsingMath(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumSet = 0;
        int sumArr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) sumSet +=nums[i];
            set.add(nums[i]);
            sumArr += nums[i];
        }

        return (2 * sumSet) - sumArr;
    }
}

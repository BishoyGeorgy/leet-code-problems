class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1) return len;
        
        int cursor = 1;
        int prevElement = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prevElement) {
                nums[cursor++] = nums[i];
                prevElement = nums[i];
            }
        }
        
        return cursor;
    }
}

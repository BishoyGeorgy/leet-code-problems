class TwoSum {
    
    // Compare each element with all the upcoming elements
    // Time complexity O(n2)
    public int[] twoSum2ForLoops(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(i);
                    result.add(j);
                    i++;
                    break;
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    // Get the complementry number for nums[i] then search in the hashmap
    // Time complexity : O(n)
    public int[] twoSumUsingHashMap(int[] nums, int target) {
       Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[] {i, numsMap.get(complement)};
            }
            numsMap.put(nums[i], i);
        }
        
        return null;
    }
}

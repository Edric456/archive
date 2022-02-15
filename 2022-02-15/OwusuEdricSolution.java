 public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> duplicateSet = new HashSet<Integer>(); //Keeps track of values.
        
        for (int i = 0; i < nums.length; i++) {
            if (duplicateSet.contains(nums[i])) {
                return true;
            } else {
                duplicateSet.add(nums[i]);
            } /*
                if-else statement. If the hashset already contains the current value in the
                array, the function will return true since there is a duplicate.
                Otherwise, the current value will be added to the hashset.
                */
        } //for-loop. Goes through array. 
    
        return false;
    }
}

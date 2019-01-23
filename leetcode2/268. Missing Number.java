public int missingNumber(int[] nums) {
        int i,sum;
        i=sum=0;
        for(;i<nums.length;i++) {
            sum+=i-nums[i];
        }
        sum+=nums.length;
        return Math.abs(sum);
        
    }
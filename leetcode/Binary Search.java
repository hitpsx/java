public int searchInsert(int[] nums, int target) {
    	int low,high,temp;
    	low=temp=0;
    	high=nums.length-1;
    	while(low=<high) {
    		temp=(low+high)/2;
    		if(nums[temp]<target)	low=temp+1;
    		else if(nums[temp]>target)	high=temp-1;
    		else if(nums[temp]==target)	return temp;
    	}
       return low;
    }
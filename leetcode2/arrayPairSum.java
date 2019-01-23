public int arrayPairSum(int[] nums) {
        int i,temp,number;
        i=temp=0;
        number=nums.length/2;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i=i+2)
        	temp+=nums[i];
	    return temp;
    }
	 
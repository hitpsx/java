public int majorityElement(int[] nums) {
        int i,j,temp;
        i=j=temp=0;
        while(i<nums.length) {
        	if(nums[i]==nums[j]) temp++;
        	else temp--;
        	
        	if(temp==0){
                j=i;
                temp=1;
            }
        	i++;
        }
        
        return nums[j];
    }
public int pivotIndex(int[] nums) {
       int i,j,sum,temp;
       sum=j=temp=0;
       for(i=0;i<nums.length;i++) {
           sum+=nums[i];
       }
       for(;j<nums.length;j++) {
           if(sum-nums[j]==2*temp) return j;
           temp+=nums[j];
       }
        return -1;
    }


//对所有数字进行加和减去一个数字 如果满足2倍的和即为中间数
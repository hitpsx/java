 public int removeElement(int[] nums, int val) {
        int i,j,temp;
        i=0;
        j=nums.length-1;
        while(i<=j) {
            while(nums[i]==val && j>=i) {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=0;
                j--;
            }
            i++;
        }
        for(i=0;i<=j;i++)
            System.out.print(nums[i]);
        //System.out.println(j);
        return j+1;
    }



public int removeElement(int[] nums, int val) {
        int i,j;
        i=j=0;
        while(i<nums.length) {
            if(nums[i]!=val) nums[j++]=nums[i];
            i++;
        }
        return j;
    }
  public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> te=new ArrayList();
        while(i<nums.length) {
            int temp=Math.abs(nums[i])-1;
            if(nums[temp]>0) nums[temp]=-nums[temp];
            i++;
        }
        i=0;
        while(i<nums.length) {
            if(nums[i]>0) te.add(i+1);
            i++;
        }
        return te;
    }

    //本题思路比较特殊，没有采用O(n)的空间去打表解决，而是通过便利每个元素，并对当前所存数字对应下标取反
    //比如[4,2,3,2] ，0对应的是数字4，直接对数字4下标对应的元素2进行取反操作变成-2 ，然后如果数字存在该数字对应的元素必定为负数，若为正数必定在数组中没有
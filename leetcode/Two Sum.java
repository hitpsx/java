 public int[] twoSum(int[] numbers, int target) {
		int[] temp=new int[2];
		int i,j,temp1;
		i=0;
		j=numbers.length-1;
		while(true) 
		{
			temp1=target-numbers[i];
			j=Arrays.binarySearch(numbers, temp1);
			if(j>=0 && j!=i)
			{
                if(i<j) 
				{
					temp[0]=i+1;
					temp[1]=j+1;
					break;
				}
				else {
					temp[0]=j+1;
					temp[1]=i+1;
					break;
				}
			}
			else {
				i++;
			}
	    }
		return temp;
	    }
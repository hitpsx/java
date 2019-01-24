public int[] plusOne(int[] digits) {
        int high=digits.length-1;
        int tag=0;
        int []temp=new int[digits.length+1];
        digits[high]++;
        while(high>=0) {
        	if(digits[high]==10) {
        		digits[high]=0;
        		if(high==0)
        		{
        			tag=1;
        			break;
        		}
        		digits[high-1]++;
        		high--;
        	}
        	else if(digits[high]<=9)
        		break;
        }
        if(tag==1) {
        	temp[0]=1;
        	return temp;
        }
        return digits;
    }
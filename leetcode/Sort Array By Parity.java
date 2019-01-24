 public int[] sortArrayByParity(int[] A) {
         int i,j,temp;
	        i=0;
	        j=A.length-1;	   
	        while(i<j) {

	        	while(A[i]%2==0 && i<A.length-1)	i++;
	        	while(A[j]%2!=0 && j>0 )	j--;
	        	
                if(i==A.length || j==-1 || i>=j) break;
                
	        	temp=A[i];
	        	A[i]=A[j];
	        	A[j]=temp;
	        	i++;
	        	j--;
	        }
	        return A;
    }
	 
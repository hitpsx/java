public boolean isMonotonic(int[] A) {
	        int flag=0;
	        int i=0;
	        while(i<A.length) {
	        	if(A[i]==A[i+1]) i++;
	        	else if(A[i]>A[i+1]) {
	        		flag=2;break;
	        	}
	        	else if(A[i]<A[i+1]) {
	        		flag=1;break;
	        	}
	        	if(i==A.length-1) return true;
	        }
	        if(flag==1) {
	        	  while(i<A.length-1) {
	  	        	if(A[i]>A[i+1]) {
	  	        		return false;
	  	        	}
	  	        	i++;
	        	  }
	        }
	        else {
	        	 while(i<A.length-1) {
		  	        	if(A[i]<A[i+1]) {
		  	        		return false;
		  	        	}
		  	        	i++;
	        	 }
	      
	        }
	        return true;
	        
	    }
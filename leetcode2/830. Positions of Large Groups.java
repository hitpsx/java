 public List<List<Integer>> largeGroupPositions(String S) {
        List <List<Integer>> te=new ArrayList();
        List <Integer> tp=new ArrayList();
        int j,temp;
        j=temp=0;
        for(int i=1;i<S.length();i++) {
        	if(S.charAt(i)==S.charAt(j)) {
        		temp++;
        		if(tp.contains(j)==false)  {
        			tp.add(j);
        			//System.out.print("start: "+j);
        		}
        		
        	}
        	else {
        		if(temp>0) {
	        		tp.add(i-1);
	        		//System.out.println("over: "+(i-1));
	        		if(i-j>2)
	        			te.add(tp);
	        		tp=new ArrayList();
        		}
	        	temp=0;
	        	j=i;
        	}
        }
        if(temp>0 && S.length()-j>2) {
        	tp.add(S.length()-1);
        	te.add(tp);
        }
       // System.out.print(te.size());
        return te;
    }
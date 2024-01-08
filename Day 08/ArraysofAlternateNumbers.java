
class Solution {
    void rearrange(int nums[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>() ;
    	ArrayList<Integer> neg = new ArrayList<Integer>() ;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] < 0) {
    			neg.add(nums[i]);
    		} else {
    			pos.add(nums[i]);
    		}
    	}
    	
    	if (pos.size() > neg.size()) {
    	    for (int i = 0; i <  neg.size(); i++) {
    	        nums[2 * i] = pos.get(i);
    	        nums[2 * i + 1] = neg.get(i);
    	    }
    	    
    	    int posIndex = neg.size() * 2;
    	    for (int i = neg.size(); i < pos.size(); i++) {
    	        nums[posIndex] = pos.get(i);
    	        posIndex++;
    	    }
    	} else {
    	    for (int i = 0; i <  pos.size(); i++) {
    	        nums[2 * i] = pos.get(i);
    	        nums[2 * i + 1] = neg.get(i);
    	    }
    	    
    	    int negIndex = pos.size() * 2;
    	    for (int i = pos.size(); i < neg.size(); i++) {
    	        nums[negIndex] = neg.get(i);
    	        negIndex++;
    	    }
    	}
    	
    }
}
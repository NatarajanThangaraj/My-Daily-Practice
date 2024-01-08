package LeetCodeEveryDay;

public class MaximumValueString {

	public static void main(String[] args) {
		MaximumValueString max=new MaximumValueString();
		String[] strs= {"alic3","bob","3","4","00000"};
		//max.maximumValue(strs)
		System.out.println(max.maximumValue(strs));
	}
	
	    public int maximumValue(String[] strs) {
	    	int max=0,temp=0,number=0;
	        for(String str:strs) {
	         try {
	        	 number=Integer.valueOf(str);
	        	 temp=number;
	         }catch(NumberFormatException e) {
	        	 temp=str.length();
	         }
	        	if(temp>max) {
	        		max=temp;
	        	}
	        }
	        return max;
	    }
    

}

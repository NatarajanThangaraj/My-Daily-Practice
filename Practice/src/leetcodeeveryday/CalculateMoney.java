package leetcodeeveryday;

public class CalculateMoney {

	public static void main(String[] args) {
		 CalculateMoney obj= new  CalculateMoney();
		 System.out.println(obj.totalMoney(26));
	}
	 public int totalMoney(int n) {
		 if(n<=7) {
	        	return n*(n+1)/2;
	        }
	        int quatient=n/7;
	        int remainder=n%7;
					int temp=7*((quatient-1)*(quatient)/2);
				
	        int another=(quatient+1)+((quatient)+remainder);
	       
	         return (quatient*28+(temp))+(remainder*another)/2;
	        
	    }

}

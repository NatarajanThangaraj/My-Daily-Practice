package Recursion;

public class Combinations {

	public static void main(String[] args) {
		Combinations comb=new Combinations();
		String str="abc";
			comb.Recusive(str,"");	
	}
	private void Recusive(String str, String temp) {
		if(str.length()==0) {
			System.out.println("{"+temp+"}");
			return ;
		}
		Recusive(str.substring(1),temp+str.charAt(0));
		Recusive(str.substring(1),temp);
	}

}

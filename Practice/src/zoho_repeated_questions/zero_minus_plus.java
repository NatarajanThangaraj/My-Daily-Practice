package zoho_repeated_questions;

public class zero_minus_plus {

	public static void main(String[] args) {
	int []Array= {1,1,0,-2,-5};
	countOfplusMinus(Array);
	}

	private static void countOfplusMinus(int[] array) {
		int plus=0,minus=0,zero=0;
		for(int x:array) {
			if(x==0)
				zero++;
			else if(x<0)
				minus++;
			else
				plus++;
		}
		System.out.printf("Zero=%4f Minus=%4f Plus=%4f",(double)zero/array.length,(double)minus/array.length,(double)plus/array.length);
		
	}

}

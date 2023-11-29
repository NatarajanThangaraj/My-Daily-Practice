package LeetCodeEveryDay;

import GetInput.Input;

public class DivideaLongCorridor {

	public static void main(String[] args) {
		String str = "SPSPPPSPPSSS";// Input.getInputString();
		System.out.println(new DivideaLongCorridor().numberOfWays(str));
	}

	private int numberOfWays(String str) {
		long result=1,seat=0,plant=0;
		final long MOD=(long)1e9+7;
		for(int index=0;index<str.length();index++) {
			char x=str.charAt(index);
			if(x=='S') {
				if(++seat>2&&seat%2==1) {
					result=result*(index-plant)%MOD;
				}
				plant=index;
			}
		}
		return (seat>0&&seat%2==0)? (int)result:0;
	}

}

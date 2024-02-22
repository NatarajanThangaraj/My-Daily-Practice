package leetcodeeveryday;

public class RemovePalindromicSubSequence {

	public static void main(String[] args) {
		RemovePalindromicSubSequence obj=new RemovePalindromicSubSequence();
		String str="ababb";
		System.out.println(" output : "+obj.removePalindromeSub(str));

	}

	private int removePalindromeSub(String s) {
		if(s.equals(new StringBuffer(s).reverse().toString())) {
			return 1;
		}
		return 2;
	}

}

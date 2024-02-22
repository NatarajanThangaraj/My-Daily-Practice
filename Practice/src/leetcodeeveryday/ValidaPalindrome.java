package leetcodeeveryday;

public class ValidaPalindrome {

	public static void main(String[] args) {
		System.out.println(new ValidaPalindrome().isPalindrome("Marge, let's \\\"[went].\\\" I await {news} telegram."));
	}
	public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>96&&s.charAt(i)<124||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                str.append(s.charAt(i));
            }
        }
        int x='{';
        System.out.println(x);
        System.out.println(str.reverse());
        return (str.toString().equals(str.reverse().toString()));
    }

}

package LeetCodeEveryDay;

public class LongestOddNumberinString {

	public static void main(String[] args) {
		System.out.println(new LongestOddNumberinString().largestOddNumber("198"));

	}
public String largestOddNumber(String num) {
	int end=num.length()-1;
	while(end>=0) {
		if(Integer.parseInt(num.charAt(end)+"")%2!=0) {
			return num.substring(0,end+1);
		}
		end--;
	}
        return "";
    }

}

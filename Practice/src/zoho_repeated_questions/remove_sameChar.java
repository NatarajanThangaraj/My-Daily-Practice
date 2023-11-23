package zoho_repeated_questions;
/*Input:
 * str1=ZOHOcORPORATION
 * str2=pora
 * Output=ZHcTIN*/
public class remove_sameChar {

	public static void main(String[] args) {
		String str1="ZoHocorPoration";
		String str2="pora";
		System.out.println("Output : "+removeChar( str1,str2));

	}

	private static String removeChar(String str1, String str2) {
		String Answer="";
String []str3=str1.split("");
	String[]str4=str2.split("");
		for(int i=0;i<str3.length;i++) {
boolean flag=false;
			for(int j=0;j<str4.length;j++) {
			if(str3[i].equalsIgnoreCase(str4[j])) {
					flag=true;
					break;
				}
		}
			if(!flag)
				Answer+=str1.charAt(i);
		}

		return Answer;
	}

}

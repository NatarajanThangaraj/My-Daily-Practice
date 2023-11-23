package zoho_repeated_questions;
/* Write a program that takes following input to give the corresponding output
 * input : a1b2c3
 * output:abbccc
 * 
 * input : d2f4c6
 * output : ddffffcccccc*/
import java.util.Scanner;
public class Question_1 {
	String Answer="";
public  String recursiveMethod(String str) {
	String Number="";
	char letter=' ';
for(char c: str.toCharArray()) {
	if(!(c>='0'&&c<='9')) {
		if(Number!="") {
			int count=Integer.parseInt(Number);
			for(int i=0;i<count;i++)
				Answer+=letter;
		}
	
		letter=c;
		Number="";
	}
	else
		Number+=c;
	
	
}
int count=Integer.parseInt(Number);
for(int i=0;i<count;i++)
	Answer+=letter;
	return Answer;
}
	public static void main(String[] args) {
		Question_1 object=new Question_1();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String string=scan.next();
		System.out.println("output : "+object.recursiveMethod(string));
    scan.close();
	}

}

package Recursion;
import java.util.Scanner;
public class fibonnaci_series {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the Limit : ");
	int limit=scan.nextInt();
	int i=0,j=1;
	System.out.println("Fibnocci Series : "+fibonacci(limit,i,j));
	scan.close();
	
	}
	 static String Answer="";
static String fibonacci(int limit,int i,int j) {	
	int temp=i;
	i=i+j;
	j=temp;
	if(j>=limit) 
		return Integer.toString (j);
	Answer+=j+" ";
	fibonacci(limit,i,j);	
return Answer;
}

}

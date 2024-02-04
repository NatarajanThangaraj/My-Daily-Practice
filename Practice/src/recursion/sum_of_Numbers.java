package recursion;
import java.util.Scanner;
public class sum_of_Numbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int Number=scan.nextInt();
	System.out.println(findSum(Number,0));
scan.close();
	}
static int findSum(int Number,int i) {
	if(Number==0) {
		return Number;
	}
	return Number%10+findSum(Number/10,i+1);
}

}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteinJson {
	public static void main(String[] args) throws IOException {
//		String FileName="C:\\Users\\ELCOT\\Downloads\\UnReservedTicketBooking.csv";
//		Map<String,String>map=new HashMap<>();
//		try {
//			FileReader reader=new FileReader(new File(FileName));
//			BufferedReader bfread=new BufferedReader(reader);
//			String[] placeAndDistance;
//			String eachLine=bfread.readLine();
//			while(eachLine!=null) {
//				placeAndDistance=eachLine.split(",");
//				//eachLine=bfread.readLine();
//				//System.out.println(Arrays.toString(placeAndDistance));
//			map.put(placeAndDistance[0],placeAndDistance[1] );
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.println(map);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name : ");
		while(true) {
		try {
		int n=scan.nextInt();
		break;
		}catch(Exception e) {
			System.out.println("Please Enter Correct Input : ");
			scan.next();
		}
		}
	}
}
   


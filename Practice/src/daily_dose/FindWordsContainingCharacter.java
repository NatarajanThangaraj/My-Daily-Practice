package daily_dose;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

	public static void main(String[] args) {
		FindWordsContainingCharacter obj=new FindWordsContainingCharacter();
		System.out.println(obj.findChar(new String[]{"leet","code","aaaa","cbc"}, 'z'));
	}
   public 	List<Integer> findChar(String[] words,char x){
	   List<Integer>list=new ArrayList();
	   int index=0;
	   for(String str:words) {
		   if(str.indexOf(x)!=-1) {
			   list.add(index);
		   }
		   index++;
	   }
	   return list;
   }
}

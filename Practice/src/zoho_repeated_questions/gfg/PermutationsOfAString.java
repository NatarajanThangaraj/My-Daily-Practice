package zoho_repeated_questions.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsOfAString {

	public static void main(String[] args) {
		String S="ABC";
		List<String>list=new ArrayList<>();
        char[] arr=S.toCharArray();
        findAllPerm(arr,list,0);
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println(list);
    }
    static void findAllPerm(char[] arr,  List<String>list,int fixed){
        if(fixed==arr.length){
            if(!list.contains(new String(arr)))
            list.add(new String(arr));
            return;
        }
        for(int i=fixed;i<arr.length;i++){
            swap(arr,i,fixed);
            findAllPerm(arr,list,fixed+1);
            swap(arr,i,fixed);
        }
    }
    static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}

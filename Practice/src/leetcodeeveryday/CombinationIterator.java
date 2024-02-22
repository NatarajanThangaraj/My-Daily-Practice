package leetcodeeveryday;

import java.util.PriorityQueue;
import java.util.Queue;

public class CombinationIterator {
	static Queue<String>q=new PriorityQueue<>();
	public static void main(String[] args) {
		CombinationIterator obj = new CombinationIterator("abc", 2);
		System.out.println(q);
		;
		//  String param_1 = obj.next();
		//  boolean param_2 = obj.hasNext();
		 
	}
    public CombinationIterator(String str, int len) {
        recursive(str,"",len);
    
	}
    
    private void recursive(String str, String temp, int len) {
		if(temp.length()==2) {
			q.add(temp);
			return;
		}
		if(str.equals("")) {
			return;
		}
		recursive(str.substring(1),temp+str.charAt(0),len);
		recursive(str.substring(1),temp,len);
		
	}

	public String next() {
        return  q.poll();
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }

}

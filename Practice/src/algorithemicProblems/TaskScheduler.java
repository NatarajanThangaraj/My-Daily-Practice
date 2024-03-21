package algorithemicProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TaskScheduler {

	public static void main(String[] args) {
		char[] arr= {'A','A','A','B','B','B','C','C','C','D','D','E'};
		int intervel=2;
		System.out.println("minimum time : "+leastInterval(arr,intervel));

	}
	 public static int leastInterval(char[] tasks, int n) {
	       int time=0;
	       Map<Character,Integer>map=new HashMap<>();
	       for(char x:tasks) {
	    	  map.put(x, map.getOrDefault(x,0)+1);
	       }
	       PriorityQueue<Entry<Character,Integer>>queue=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
	       queue.addAll(map.entrySet());
	       int temp=0;
	       Entry<Character,Integer>head=queue.peek();
	       while(head.getValue()!=0) {
	    	   temp=n+1;
	    	   System.out.println(queue);
	    	 for(Entry<Character,Integer> entry:queue) {
	    		 if(entry.getValue()!=0) {
	    		 entry.setValue(entry.getValue()-1);
	    		 temp--;
	    		 time++;
	    		 if(temp==0) {
	    			 break;
	    		 }
	    		 }
	    	 }
	    	 if(temp>0&&head.getValue()!=0)
	    	 time+=temp;
	    	 
	    	 System.out.println(queue+" "+temp+" "+time);
	       }
	       for(Entry<Character,Integer> entry:queue) {
	    		 if(entry.getValue()!=0) {
	    			 time+=entry.getValue();
	    		 }
	    	 }
	      // System.out.println(map);
		 return time;
	    }

}

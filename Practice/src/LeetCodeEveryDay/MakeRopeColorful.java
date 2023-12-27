package LeetCodeEveryDay;

public class MakeRopeColorful {

	public static void main(String[] args) {
		MakeRopeColorful obj=new MakeRopeColorful ();
		String str="aabaa";
		int[] arr= {1,2,3,4,1};
		System.out.println(obj.minCost(str, arr));

	}
public int minCost(String colors, int[] neededTime) {
        int time=0;
        int temp=neededTime[0];
        int max=neededTime[0];
        char[] arr=colors.toCharArray();
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]!=arr[i-1]) {
        		time+=temp-max;
        		temp=neededTime[i];
        		max=neededTime[i];
        	}else {
        		temp+=neededTime[i];
        		max=Math.max(max, neededTime[i]);
        	}
        	if(i==arr.length-1) {
        		time+=temp-max;
        	}
        }
        return time;
    }
 
}

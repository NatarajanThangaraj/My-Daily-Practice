package dynamicprogramming;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Maximum water : "+findMaxUnit(arr));
	}

	private static int findMaxUnit(int[] arr) {
		int water=0,index=0,max=arr[0],leftMax=arr[0],rightMax=arr[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				index=i;
				max=arr[i];
			}
		}
		for(int i=0;i<index;i++) {
			if(leftMax<arr[i]) {
				leftMax=arr[i];
			}
			//System.out.println(leftMax+" "+arr[i]+" "+water);
			water+=leftMax-arr[i];
			
		}
		for(int i=arr.length-1;i>index;i--) {
			if(rightMax<arr[i]) {
				rightMax=arr[i];
			}
			//System.out.println(rightMax+" "+arr[i]+" "+water+"-");
			water+=rightMax-arr[i];
		
		}
		return water;
	}

}

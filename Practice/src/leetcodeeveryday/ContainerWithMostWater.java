package leetcodeeveryday;

/*You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *Find two lines that together with the x-axis form a container, such that the container contains the most water.
*Return the maximum amount of water a container can store.
*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 In this case,the max area of water (blue section) the container can contain is 49.*/
public class ContainerWithMostWater {

	public static void main(String[] args) {
		ContainerWithMostWater capacity=new ContainerWithMostWater();
		int[] arr= {1,8,6,2,5,4,8,3,7};
		System.out.println(capacity.maxArea(arr));
	}

	public int maxArea(int[] height) {
		int max=height.length;
		int maxcapacity=0;
		int temp=0;
		for(int i=0,j=height.length-1;i<j;) {
			temp=Math.min(height[i],height[j]);
			if(max>j-i) {
				if(maxcapacity<temp*(j-i)) {
					maxcapacity=temp*(j-i);
				}
				max=j-i;
			}
			if(height[i]<height[j]) {
				i++;
			}else {
				j--;
				
			}
		}
		return maxcapacity; 
	}
	

}

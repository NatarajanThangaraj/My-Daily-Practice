package sliding_window_and_prefixsum;

public class BinaryArrayWithSum {

	public static void main(String[] args) {
		int[] arr= {1,0,1,0,1};
		int goal=2;
		System.out.println("output "+numSubarraysWithSum(arr,goal));
	}
	public static  int numSubarraysWithSum(int[] nums, int goal) {
		int p1=0,p2=0,sum,count=0,n=nums.length;
		for(p1=p2;p1<n;p1++) {
			sum=0;
			for(p2=p1;p2<n;p2++) {
				sum+=nums[p2];
				if(sum==goal) {
					count++;
				}
				
			}
		}
		return count;
	}

}
/*=========== BRUTE FORCE =======
 * 
 * 
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        int start=goal;
        if(start==0)
        start=1;
        for(int size=start;size<=n;size++){
            for(int i=0;i<=n-size;i++){
            if(findSum(nums,i,i+size)==goal){
                count++;
            }
            }
        }
        return count;
    }
    int findSum(int[] nums,int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=nums[i];
        }
        return sum;
    }
}*/
/* ============ BETTER SOLUTION  o[n2]==============
 * 
 * 
 * int p1=0,p2=0,sum,count=0,n=nums.length;
		for(p1=p2;p1<n;p1++) {
			sum=0;
			for(p2=p1;p2<n;p2++) {
				sum+=nums[p2];
				if(sum==goal) {
					count++;
				}
				
			}
		}
		return count;*/

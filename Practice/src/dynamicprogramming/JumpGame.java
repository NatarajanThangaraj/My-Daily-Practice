package dynamicprogramming;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 3, 3, 1, 0, 4 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		return recursive(0, nums, false);
	}

	private static boolean recursive(int index, int[] nums, boolean flag) {

		int reachable=0;
		for (int i = 0; i < nums.length; i++) {
			if(i>reachable) return false;
			reachable=Math.max(reachable, i+nums[i]);
		}
		return true;
	}

}

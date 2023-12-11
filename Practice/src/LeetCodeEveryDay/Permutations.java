package LeetCodeEveryDay;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		Permutations perm = new Permutations();
		int[] arr = { 1, 2, 3 };
		System.out.println(perm.permute(arr));
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList();
		List<Integer> temp = new ArrayList();
		boolean[] flag = new boolean[nums.length];
		recure(nums, temp, ans, flag);
		return ans;
	}

	private void recure(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] flag) {
		if (temp.size() == nums.length) {
			ans.add(new ArrayList(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if(!flag[i]) {
				flag[i]=true;
				temp.add(nums[i]);
				recure(nums,temp,ans,flag);
				temp.remove(temp.size()-1);
				flag[i]=false;
			}
		}

	}

}

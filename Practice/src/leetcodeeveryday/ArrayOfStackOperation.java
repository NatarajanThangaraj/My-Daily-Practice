package leetcodeeveryday;

import java.util.ArrayList;
import java.util.List;

import GetInput.Input;

public class ArrayOfStackOperation {

	public static void main(String[] args) {
		ArrayOfStackOperation obj=new ArrayOfStackOperation();
		int[] arr={2,3,4};//Input.getInputArray();
		System.out.println("Expected Answer : "+obj.operationArray(arr));		
	}

	private List<String> operationArray(int[] arr) {
		int index=0;
		 List<String>ans=new ArrayList();
		 for(int i=1;i<=arr[arr.length-1];i++) {
			 if(arr[index]==i) {
				 ans.add("Push");
				 index++;
			 }else {
				 ans.add("Push");
				 ans.add("Pop");
			 } 
		 }
		return ans;
	}

}

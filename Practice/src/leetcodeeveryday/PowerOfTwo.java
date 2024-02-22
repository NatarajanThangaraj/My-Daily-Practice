package leetcodeeveryday;

import GetInput.Input;

public class PowerOfTwo {

	public static void main(String[] args) {
		PowerOfTwo obj=new PowerOfTwo();
		int n=(int )Input.getInputNumber();
		System.out.println("Your Number is "+obj.powTwo(n)+" power of two");
		
	}
	public boolean powTwo(int n) {
		if(n==1) {
			return true;
		}else if(n%2==1) {
			return false;
		}
		return powTwo(n/2);
	}

}

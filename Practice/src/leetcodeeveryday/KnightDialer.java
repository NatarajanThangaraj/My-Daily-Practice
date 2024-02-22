package leetcodeeveryday;

import GetInput.Input;

/*
 * The chess knight has a unique movement, it may move two squares vertically and one square horizontally, 
 * or two squares horizontally 
 * and one square vertically (with both forming the shape of an L).
 *  The possible movements of chess knight are shown in this diagaram:

A chess knight can move as indicated in the chess diagram below:
Given an integer n, return how many distinct phone numbers of length n we can dial.

You are allowed to place the knight on any numeric cell initially and then you should perform n - 1 jumps to dial a number of length n. 
All jumps should be valid knight jumps.

As the answer may be very large, return the answer modulo 109 + 7.
Input: n = 2
Output: 20
Explanation: All the valid number we can dial are [04, 06, 16, 18, 27, 29, 34, 38, 40, 43, 49, 60, 61, 67, 72, 76, 81, 83, 92, 94]*/
public class KnightDialer {

	public static void main(String[] args) {
		int n=(int)Input.getInputNumber();
		System.out.println(new KnightDialer().knightDialer(n));
	}

	private long knightDialer(int n) {
		int sum=0;
		int[] prev= {1,1,1,1,1,1,1,1,1,1};
		for(int i=2;i<=n;i++) {
			int[] current=new int[10];
			current[0]=prev[4]+prev[6];
			current[1]=prev[8]+prev[6];
			current[2]=prev[7]+prev[9];
			current[3]=prev[4]+prev[8];
			current[4]=prev[3]+prev[9]+prev[0];
			current[5]=0;
			current[6]=prev[7]+prev[1]+prev[0];
			current[7]=prev[2]+prev[6];
			current[8]=prev[1]+prev[3];
			current[9]=prev[4]+prev[2];
			prev=current;
		}
		for(int x:prev) {
			sum+=x;
		}
		
		return sum%1000000007;
	}

}

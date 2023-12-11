package LeetCodeEveryDay;

import java.util.Stack;

/*You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
Evaluate the expression. Return an integer that represents the value of the expression.
Note that:
The valid operators are '+', '-', '*', and '/'.
Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22*/
public class ReversePolishNotation {

	public static void main(String[] args) {
		ReversePolishNotation obj=new ReversePolishNotation();
		String[] arr={"2","1","+","3","*"};
		System.out.println("The answer is : "+obj.evalRPN(arr));
		//System.out.println(15+String.valueOf("+")+16);
	}
public int evalRPN(String[] tokens) {
	int b=0;
        Stack<Integer>stack=new Stack();
        for(String x:tokens) {
        if(x.equals("+")) {
        	 b=stack.pop();
        	stack.push(stack.pop()+b);
        }else if(x.equals("+")) {
        	b=stack.pop();
        	stack.push(stack.pop()-b);
        }else if(x.equals("+")) {
        	b=stack.pop();
        	stack.push(stack.pop()/b);
        }else if(x.equals("+")) {
        	b=stack.pop();
        	stack.push(stack.pop()*b);
        }else {
        	stack.push(Integer.parseInt(x));
        }
        }
        return stack.pop();
    }

}

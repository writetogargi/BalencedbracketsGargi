
//program to determine the given brackets string is Balanced or Un-balanced.

package com.balance.main;
import java.util.Stack;

public class BalancedBrackets {
	
	
	private static boolean isBalancedBrackets(String expr) {
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<expr.length();i++) {
			
			char ch=expr.charAt(i);
			
			if(ch== '(' || ch=='[' || ch == '{' ) {
				stack.push(ch);
				continue;
			}
			
			if (stack.isEmpty()) {
				return false;
			}
			char c;
			switch(ch) {
			
			case '}' : c=stack.pop();
					if(c=='(' || c== '[')
				return false;
					break;
			
			case ')' : c=stack.pop();
					if (c=='{' || c=='[')
				return false;
					break;
			
			case ']' : c=stack.pop();
					if (c=='{' || c=='(')
					return false;
					break;
			
			}
		}
	     return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String expr = "([[{}]])";
		
		if (isBalancedBrackets(expr)) {
			System.out.println("Given braclets is Balenced");
			} else {
				System.out.println("Given braclets is Un-Balenced");
		}
	}
	
}
	




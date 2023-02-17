package com.pranav.dsa;

import java.util.Stack;

public class BalancedBracket {
	
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c=='(' || c == '[' || c=='{' || c == '}'|| c== ']' || c==')') {
				return false;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char top = stack.pop();
			if(!(c==')'&& top == '(')||( c == '}'&& top == '{')||( c == ']'&& top =='[')) {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(([()]))";
		
		System.out.println(s + "ok");

	}

}

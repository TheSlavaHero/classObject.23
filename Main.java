package com.gmail.theslavahero;

public class Main {

	public static void main(String[] args) {
		Stack stack1 = new Stack();
		BlackList blacklist = new BlackList();
		
		String text = "text";
		blacklist.addToBlackList(text);
		stack1.setBlacklist(blacklist);
		boolean bl = true;
		int integer = 5;
		long loong = 672565445;
		double doubledouble = 3.333333;
		
		stack1.addItem(text);
		stack1.addItem(bl);
		stack1.addItem(integer);
		System.out.println(stack1.getTopItem());
		stack1.addItem(loong);
		stack1.addItem(doubledouble);
		System.out.println(stack1.toString());
		System.out.println(stack1.getTopItem());
		
		System.out.println(stack1.getAndDeleteTopItem());
		System.out.println(stack1.getAndDeleteTopItem());
		System.out.println(stack1.getAndDeleteTopItem());
		stack1.addItem(text);


	}

}

package com.gmail.theslavahero;

import java.util.Arrays;

public class Stack {
	private Object[] item;
	private BlackList blacklist;

	public Stack(Object[] item, BlackList blacklist) {
		super();
		this.item = item;
		this.blacklist = blacklist;
	}

	public Stack() {
		super();
		this.item = new Object[0];
	}

	public Object[] getItem() {
		return item;
	}

	public void setItem(Object[] item) {
		this.item = item;
	}

	public BlackList getBlacklist() {
		return blacklist;
	}

	public void setBlacklist(BlackList blacklist) {
		this.blacklist = blacklist;
	}

	public void addItem(Object object) {
		for (int i = 0; i < blacklist.getList().length; i++) {
			if (blacklist.getList()[i] == object.getClass()) {
				System.out.println("This object is in blacklist.");
				return;
			}
		}
		Object[] temp = new Object[item.length + 1];
		copyArrayFromTo(item,temp);
		temp[temp.length - 1] = object;
		item = temp;
	}

	public Object getTopItem() {
		return item[item.length - 1];
	}

	public Object getAndDeleteTopItem() {
		Object tempObj = item[item.length - 1];
		Object[] temp = new Object[item.length - 1];
		copyArrayFromTo(item, temp);
		item = temp;
		return tempObj;
	}

	private void copyArrayFromTo(Object[] from, Object[] to) {
		for (int i = 0; i < from.length && i < to.length; i++) {
			to[i] = from[i];
		}
	}

	@Override
	public String toString() {
		return "Stack [item=" + Arrays.toString(item) + ", blacklist=" + blacklist + "]";
	}

	
}

package com.gmail.theslavahero;

import java.util.Arrays;

public class BlackList {
	private Object[] list;

	public BlackList(Object[] list) {
		super();
		this.list = list;
	}

	public BlackList() {
		super();
		this.list = new Object[0];
	}

	public Object[] getList() {
		return list;
	}

	public void setList(Object[] list) {
		this.list = list;
	}
	
	public void addToBlackList(Object obj) {
		Object[] temp = new Object[list.length + 1];
		copyArrayFromTo(list,temp);
		temp[temp.length - 1] = obj.getClass();
		list = temp;
	}
	
	private void copyArrayFromTo(Object[] from, Object[] to) {
		for(int i = 0; i < from.length && i < to.length; i++) {
			to[i] = from[i];
		}
	}

	@Override
	public String toString() {
		return "BlackList [list=" + Arrays.toString(list) + "]";
	}

}

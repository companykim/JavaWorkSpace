package test.dream.lib;

import www.dream.lib.ReferenceHelper;

public class TestReferences {
	
	public static void main(String[] args) {
		int x = 0, y = 9;
		y = ReferenceHelper.swap(x, x = y);
		
		String xx = "hjfg", yy = "htrex";
		yy = ReferenceHelper.swap(xx, xx = yy);
		
		System.out.println("xx = " + xx + "\nyy = " + yy);
	}
}

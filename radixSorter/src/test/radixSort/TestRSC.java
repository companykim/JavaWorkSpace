package test.radixSort;

import radixsort.RSC;
import radixsort.RS_Performance;

public class TestRSC {
	public static void main(String[] args) {
		final int data_size = 10000000; // 1천만
		Long[] data = new Long[data_size];
		long[] IData = new long[data_size];
		for (int i = 0; i < data_size; i++) {
			// -5억 5억
			data[i] = (long) (Math.random() * 100000000) - 500000000;
			IData[i] = data[i];
		}
		long startTimeMillis = System.currentTimeMillis();
		data = RSC.rxSort(data, 10);
		long dupTimeMillis = System.currentTimeMillis() - startTimeMillis;
		System.out.printf("걸린 시간은 %d밀리초입니다.\n", dupTimeMillis);

		startTimeMillis = System.currentTimeMillis();
		IData = RS_Performance.rxSort(IData);
		dupTimeMillis = System.currentTimeMillis() - startTimeMillis;
		System.out.printf("걸린 시간은 %d밀리초입니다.\n", dupTimeMillis);
		
		for(int i = 0; i < 10; i++)
			System.out.print(data[i] + " ");
		System.out.println();
	}
}

package test.radixSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import radixsort.RS_Performance;

class junitTestRSC {

	@Test
	void test() {
		long[] data = { 0, 1, -1 };
		
		long[] sorted = RS_Performance.rxSort(data);
		long prev = sorted[0];
		for (int i = 1; i < 3; i++) {
			assertTrue(prev <= sorted[i]);
			prev = sorted[i];
		}
		assertTrue(prev == 1);
		
	}
	
}

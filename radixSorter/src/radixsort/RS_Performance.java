package radixsort;

import java.util.Arrays;

import www.dream.lib.ReferenceHelper;

public class RS_Performance {
	private static final byte MASK = 0b1111, MASK_LENGTH = 4;
	
	public static long[] rxSort(long[] data) {
		int dataSize = data.length;
		long[] sortResult = Arrays.copyOf(data, dataSize);

		// 버킷별 요소 개수
		int[] dataSizePerBucket = new int[MASK + 1];
		// 각 데이터 별 버킷 번호
		byte[] bucketId = new byte[dataSize];
		
		// 마지막 처리 용도로 정의
		int positiveCount = 0;
		
		for (int shiftCnt = 0; shiftCnt < Long.SIZE; shiftCnt += MASK_LENGTH) {
			for (int i = 0; i <= MASK; i++) {
				dataSizePerBucket[i] = 0; // 개수 초기화
			}
			
			// 각 숫자에 현재 관심 자리를 기준으로 방별 발생횟수를 샌다.
			for (int j = 0; j < dataSize; j++) {
				bucketId[j] = (byte) ((data[j] >> shiftCnt) & MASK);
				dataSizePerBucket[bucketId[j]]++;
			}
			
			// 누적하기
			for (int i = 1; i < MASK + 1; i++) {
				dataSizePerBucket[i] += dataSizePerBucket[i - 1];
				if (i == MASK / 2) {
					positiveCount = dataSizePerBucket[i]; 
				}
		    } 
			
		    // 카운트를 사용해 각 항목의 위치를 결정한다.
		    // 계수정렬 방식
		    for (int j = dataSize - 1; j >= 0; j--) { // 뒤에서부터 시작
		    	sortResult[dataSizePerBucket[bucketId[j]] - 1] = data[j];
		    	dataSizePerBucket[bucketId[j]]--; // 해당 숫자 카운트를 1 감소
		    }
		    // 데이터 교환
		    data = ReferenceHelper.swap(sortResult, sortResult = data);
		}
		//0 0 1 8 8 24 72 126 127 -128 -128 -127 -120 -104 -1 
		// 양수 넣기
		System.arraycopy(data, 0, sortResult, dataSize - positiveCount, positiveCount); //
		//-128 -128 -127 -120 -104 -1 0 0 1 8 8 24 72 126 127
		// 음수 넣기
		System.arraycopy(data, positiveCount, sortResult, 0, dataSize - positiveCount);
		return sortResult;
	}
	
	public static void main(String[] args) {
		long[] data = { 0, 1, -1, -128, 127, -127, 126, 
				0b00000000, 0b00001000, 0b0001000, 0b00011000, 
				(byte)0b10000000, (byte)0b10001000, (byte)0b1001000, (byte)0b10011000 };
		for (long d : data) 
			System.out.print(d + " ");
		System.out.println();
		data = rxSort(data);
		for (long d : data) 
			System.out.print(d + " ");
	}
	
	// unit (한 함수, test)
	// pmd - git, 단언
}

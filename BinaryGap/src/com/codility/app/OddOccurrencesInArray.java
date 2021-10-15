package com.codility.app;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
	int nonPaired = 0;
	int numberPasses = A.length-1;

	for (int j = 0; j < numberPasses; j++) {

	    for (int i = 1; i < numberPasses; i++) {
		if (A[i] > 0) {
		    if (A[j] == A[i]) {
			A[j] = -10;
			A[i] = -10;
		    }
		    if (A[i] > 0) {
			nonPaired = A[i];
		    }
		}
	    }
	}

	return nonPaired;
    }
}

package com.codility.app;

class CyclicRotation {
    public int[] solution(int[] A, int K) {
	
	
	for (int i=0; !(i==K);i++){
	    for (int j = A.length; j > 1; j--) {
		int tempeEments = A[j - 1];
		A[j - 1] = A[j - 2];
		A[j - 2] = tempeEments;
		
	    }
	} 
	
	return A;
    }
}

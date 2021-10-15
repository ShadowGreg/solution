package com.codility.app;

public class Solution1 {
    int input = 1041;
	String binaryRepresentation = Integer.toBinaryString(input);
	char charBinary[] = new char[binaryRepresentation.length()];
	charBinary = binaryRepresentation.toCharArray();
	int binaryGap = 1;
	int binaryGapMax = 0;

	System.out.println(charBinary);

	for (int i = 0; i < charBinary.length-1; i++) {
	    int j = i + 1;
	    if (charBinary[i] == '0' && charBinary[j] == '0') {
		binaryGap++;

	    }

	    if (charBinary[i] == '0' && charBinary[j] == '1') {
		if (binaryGapMax<binaryGap) {
		    binaryGapMax= binaryGap;
		}			
		binaryGap = 1;
	    }

	}
	System.out.println(binaryGapMax);

}

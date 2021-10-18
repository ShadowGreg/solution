package com.codility.app;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
	int jumpDistance = Y - X;
	int jumpsRequired = jumpDistance / D;
	if (jumpDistance % D != 0) {
	    jumpsRequired++; // only add extra jump if remainder exists
	}
	return jumpsRequired;
    }

}

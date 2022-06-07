package com.assignment;
import java.math.BigInteger;
import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		ArrayList<BigInteger> List1= new ArrayList<>();
		System.out.println("Enter the elements");
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<6; i++) {
			List1.add(sc.nextBigInteger());
		}
		System.out.println("Before sorting" + List1);
		Collections.sort(List1, Collections.reverseOrder());
		System.out.println("After  sorting in descending order" + List1);
	}

}

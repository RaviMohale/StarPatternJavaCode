package com.ravi.forloop;

public class StarPatternInSqare {
	public static void main(String[] args) {
		// star pattern in square

		System.out.println("star pattern in square");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("================");

		System.out.println("star pattern in left side");
		// star pattern in left side
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("================");
		System.out.println("star pattern in right side");
		for (int i = 1; i <= 5; i++) {

			for(int k= 5-i; k>=1;k--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("================");
		System.out.println("star pattern in piramid");
		for (int i = 1; i <= 5; i++) {

			for(int k= 5-i; k>=1;k--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

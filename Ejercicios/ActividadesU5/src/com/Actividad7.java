package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t1 = new int[6];
		int[] t2 = new int[6];
		int[] t3 = new int[t1.length + t2.length];

		for (int i = 0; i < t1.length; i++) {
			System.out.print(i + 1 + ": ");
			t1[i] = sc.nextInt();
		}
		
		Arrays.sort(t1);
		System.out.println(Arrays.toString(t1));
		
		for (int i = 0; i < t2.length; i++) {
			System.out.print(i + 1 + ": ");
			t2[i] = sc.nextInt();
		}

		Arrays.sort(t2);
		System.out.println(Arrays.toString(t2));
		
		int i1 = 0, i2 = 0;
		for (int i3 = 0; i3 < t3.length; i3++) {
			if (i2 >= t2.length) t3[i3] = t1[i1];
			else if (i1 >= t1.length) t3[i3] = t2[i2];
			else if (t1[i1] <= t2[i2]) {
				t3[i3] = t1[i1];
				i1++;
			} else {
				t3[i3] = t2[i2];
				i2++;
			}
		}
		
		System.out.println(Arrays.toString(t3));
	}

}

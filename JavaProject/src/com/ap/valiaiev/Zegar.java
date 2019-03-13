package com.ap.valiaiev;

public class Zegar {

	public String oblicz(int a, int b, int c, int d) {
		int[] arr = { a, b, c, d };
		
		int out2 = 0;
		int iout2 = -1;
		String out = new String();
		
		for (int i = 0; i < 4; i++) {
			if (arr[i] <= 2 && arr[i] >= out2) {
					iout2 = i;			
			}
		}
		
		if (iout2 == -1) {
			out2 = 11;
		}
		else {
		out2 = arr[iout2];
		arr[iout2] = -1;
		}
		
		out+=out2;
		
		out2 = 0;
		iout2 = -1;
		for (int i = 0; i < 4; i++) {
			if (arr[i] <= 3 && arr[i] >= out2) {
					iout2 = i;			
			}
		}
		
		if (iout2 == -1) {
			out2 = 11;
		}
		else {
		out2 = arr[iout2];
		arr[iout2] = -1;
		}
		out+=out2;
		out+=":";
		out2 = 0;
		iout2 = -1;
		
		
		for (int i = 0; i < 4; i++) {
			if (arr[i] <= 5 && arr[i] >= out2) {
					iout2 = i;			
			}
		}
		
		if (iout2 == -1) {
			out2 = 11;
		}
		else {
		out2 = arr[iout2];
		arr[iout2] = -1;
		}
		out+=out2;
		out2 = 0;
		iout2 = -1;
		
		
		for (int i = 0; i < 4; i++) {
			if (arr[i] <= 9 && arr[i] >= out2) {
					iout2 = i;			
			}
		}
		
		if (iout2 == -1) {
			out2 = 11;
		}
		else {
		out2 = arr[iout2];
		arr[iout2] = -1;
		}
		
		out+=out2;
		
		
		
		
		if (out . length() == 5) {
			System.out.println(out);
		}
		else {
			System.out.println("error");
		}
		
		return null;
	}

}
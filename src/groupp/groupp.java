package groupp;

import java.util.*;

public class groupp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 1;
		int t3 = 0;
		int num2 =0;
		int count = 1;
		int count3 =0;
		
		for(int i = 0; i < num; i++) {
			String str = sc.next();
			for(int j = 0; j < str.length(); j++) {
				if(j == str.length()-1) {
					if(str.length() ==1) {
						count3 = 0;
					}
					else {
						if(str.charAt(j) == str.charAt(j-count)) {

							for(int t = 0;  t < str.length(); t++) {
								if(str.charAt(t) == str.charAt(j)) {
									++num2;
								}
							}
							if(num2 > sum) {
								count3 = 1;
							}
							num2 = 0;
						}
						else {
							for(int t = 0;  t < str.length(); t++) {
								if(str.charAt(t) == str.charAt(j)) {
									++num2;
								}
							}
							if(num2 > sum) {
								count3 = 1;
							}
							num2 = 0;
						}
					}
					sum = 1;
				}
				else {

					if(str.charAt(j) == str.charAt(j+count)) {
						++sum;

						
					}
					else {
						for(int t = 0;  t < str.length(); t++) {
							if(str.charAt(t) == str.charAt(j)) {
								++num2;
							}
						}
						if(num2 > sum) {
							count3 = 1;
						}
						sum = 1;
						num2 = 0;
					}
				}
				
			}
			t3 += count3;
			count3 = 0;
		}
		System.out.println(num-t3);

		
	}
}
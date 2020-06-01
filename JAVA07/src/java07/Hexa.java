package java07;

import java.util.Scanner;

public class Hexa {
	public static void main(String[] args) {
		String[] hexa2bin = {"0000", "0001", "0010","0011","0100","0101","0110","0111","1000","1001","1010","1011", "1100","1101","1110","1111"
		};
		String hex;
		Scanner sc = new Scanner(System.in);
		System.out.print("16진수 문자열을 입력하시오 : ");
		hex = sc.next();
		for(int i = 0; i < hex.length(); i++) {
			if(((int) hex.charAt(i) >= 48  && (int) hex.charAt(i) <= 57)) {
				System.out.print(hexa2bin[(int)hex.charAt(i)-48] + " ");
			}
			else if ((int)hex.charAt(i) >= 97 && (int)hex.charAt(i) <= 102) {
				System.out.print(hexa2bin[(int)hex.charAt(i)-87]+ " ");
			}
		}
	}

}

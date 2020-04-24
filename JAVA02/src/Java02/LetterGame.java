package Java02;

import java.util.Scanner;

public class LetterGame {
	public static void main(String args[]) {
		int answer = 59;
		int guess ;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("정수를 입력해 주세요 : ");
			guess = scan.nextInt();
			tries++;
			if(guess > answer) {
				System.out.println("정수가 높습니다.");
			}
			else if(guess < answer) {
				System.out.println("정수가 낮습니다.");
			}
		}while(guess != answer);
		System.out.println("축하합니다.시도 횟수 : " + tries);
	}

}

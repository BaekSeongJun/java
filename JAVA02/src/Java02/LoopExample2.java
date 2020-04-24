package Java02;

import java.util.Scanner;

public class LoopExample2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int i = 1;

		while (true) {
			System.out.print("출력하고 싶은 구구단을 입력하시오 : (0을 눌러서 종료)");
			n = scan.nextInt();
			if (n != 0) {
				while (i <= 9) {
					System.out.println(n + "*" + i + "=" + n * i);
					i++;
				}
				i = 1;
			} 
			else {
				System.out.println("반복을 종료합니다.");
				break;
			}
		}
	}
}

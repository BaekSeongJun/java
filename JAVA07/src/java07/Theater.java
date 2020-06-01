package java07;

import java.util.Scanner;

public class Theater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] reserved = new int[5][10];
		
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0)");
			int reserve = sc.nextInt();
			
			if(reserve == 1) {
				System.out.println("현재 예약은 다음과 같습니다.");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
				for(int r = 0; r < reserved.length; r++) {
					System.out.print(r+1 + " ");
					for(int i = 0; i < reserved[r].length; i++) {
						System.out.print(reserved[r][i] + " ");
					}
					System.out.println();
				}
				System.out.print("몇 번째 좌석을 예약하시겠습니까?");
				int row = sc.nextInt();
				int column = sc.nextInt();
				
				if(reserved[row-1][column-1] == 0) {
					reserved[row-1][column-1] = 1;
					System.out.println("예약되었습니다.");
				}
				else
					System.out.println("예약되어있는 좌석입니다.");
			}
			else {
				break;
			}
		}
	}

}

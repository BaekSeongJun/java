package java07;

import java.util.Scanner;

public class Theater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] reserved = new int[5][10];
		
		while(true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0)");
			int reserve = sc.nextInt();
			
			if(reserve == 1) {
				System.out.println("���� ������ ������ �����ϴ�.");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
				for(int r = 0; r < reserved.length; r++) {
					System.out.print(r+1 + " ");
					for(int i = 0; i < reserved[r].length; i++) {
						System.out.print(reserved[r][i] + " ");
					}
					System.out.println();
				}
				System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
				int row = sc.nextInt();
				int column = sc.nextInt();
				
				if(reserved[row-1][column-1] == 0) {
					reserved[row-1][column-1] = 1;
					System.out.println("����Ǿ����ϴ�.");
				}
				else
					System.out.println("����Ǿ��ִ� �¼��Դϴ�.");
			}
			else {
				break;
			}
		}
	}

}

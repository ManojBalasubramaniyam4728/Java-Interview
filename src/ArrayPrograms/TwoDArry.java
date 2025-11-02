package ArrayPrograms;

import java.util.Scanner;

public class TwoDArry {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Number of row");
		int row=sc.nextInt();
		System.out.println("Number of column");
		int column=sc.nextInt();
		int[][] twoDArry=new int[row][column];
		
		for (int i = 0; i < twoDArry.length; i++) {
			for (int j = 0; j < twoDArry[i].length; j++) {
				System.out.println("eneter the "+i+" rows "+j+" coloumn data");
				twoDArry[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < twoDArry.length; i++) {
			for (int j = 0; j < twoDArry[i].length; j++) {
				System.out.print(twoDArry[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}

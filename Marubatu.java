package marubatu1;

import java.util.Scanner;

public class Marubatu {
	public static void main(String[] args) {
		String[][] array;
		array = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = " ";

			}
		}
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(array[k][l]);
				if (l == 2) {
					continue;
				}
				System.out.print(" |");
			}
			System.out.println();
		}
		String x = "1";
		String y = "-1";
		boolean repeat = true;
		Scanner scan  = null;
		int m = 0;
		while (repeat) {
			String a;
			if (m % 2 == 0) {
				System.out.println("o" + "の番です");
				a = x;
			} else {
				System.out.println("x" + "の番です");
				a = y;
			}
		    scan = new Scanner(System.in);
			System.out.println("たて");
			int number1 = scan.nextInt();

			if (number1 < 0 | number1 > 2) {
				System.out.println("もう一度数字を入れ直してください");
				continue;
			}
			System.out.println("よこ");
			int number2 = scan.nextInt();
			if (number2 < 0 | number2 > 2) {
				System.out.println("もう一度数字を入れ直してください");
				continue;
			}
			if (array[number1][number2] != " ") {
				System.out.println("すでに石が置いてあります。もう一度入力してください");
				continue;

			}

			array[number1][number2] = a;
			for (int k = 0; k < 3; k++) {
				for (int l = 0; l < 3; l++) {
					if (array[k][l] == "1") {
						System.out.print("o");
					} else if(array[k][l] == "-1"){
						System.out.print("x");
					}else {
						System.out.print(array[k][l]);
					}
					if (l == 2) {
						continue;
					}
					System.out.print(" |");
				}
				System.out.println();
			}

			// 横の判定
			for (int i = 0; i < 3; i++) {
				int no1 = 0;
				int no2 = 0;
				int no3 = 0;

				if (array[i][0] != " ") {
					no1 = Integer.parseInt(array[i][0]);
				}
				if (array[i][1] != " ") {
					no2 = Integer.parseInt(array[i][1]);
				}
				if (array[i][2] != " ") {
					no3 = Integer.parseInt(array[i][2]);
				}

				if (no1 + no2 + no3 == 3) {
					System.out.println('o' + "の勝ちです。");
					repeat = false;
				} else if (no1 + no2 + no3 == -3) {
					System.out.println('x' + "の勝ちです。");
					repeat = false;
				}
			}

			// 縦の判定
			for (int i = 0; i < 3; i++) {
				int no1 = 0;
				int no2 = 0;
				int no3 = 0;

				if (array[0][i] != " ") {
					no1 = Integer.parseInt(array[0][i]);
				}
				if (array[1][i] != " ") {
					no2 = Integer.parseInt(array[1][i]);
				}
				if (array[2][i] != " ") {
					no3 = Integer.parseInt(array[2][i]);
				}

				if (no1 + no2 + no3 == 3) {
					System.out.println('o' + "の勝ちです。");
					repeat = false;
				} else if (no1 + no2 + no3 == -3) {
					System.out.println('x' + "の勝ちです。");
					repeat = false;
				}
			}

			// 斜めの判定 1
			int no1 = 0;
			int no2 = 0;
			int no3 = 0;

			if (array[0][0] != " ") {
				no1 = Integer.parseInt(array[0][0]);
			}
			if (array[1][1] != " ") {
				no2 = Integer.parseInt(array[1][1]);
			}
			if (array[2][2] != " ") {
				no3 = Integer.parseInt(array[2][2]);
			}
			if (no1 + no2 + no3 == 3) {
				System.out.println('o' + "の勝ちです。");
				repeat = false;
			} else if (no1 + no2 + no3 == -3) {
				System.out.println('x' + "の勝ちです。");
				repeat = false;
			}

			// 斜めの判定 2
		    no1 = 0;
			no2 = 0;
			no3 = 0;

			if (array[0][2] != " ") {
				no1 = Integer.parseInt(array[0][2]);
			}
			if (array[1][1] != " ") {
				no2 = Integer.parseInt(array[1][1]);
			}
			if (array[2][0] != " ") {
				no3 = Integer.parseInt(array[2][0]);
			}
			if (no1 + no2 + no3 == 3) {
				System.out.println('o' + "の勝ちです。");
				repeat = false;
			} else if (no1 + no2 + no3 == -3) {
				System.out.println('x' + "の勝ちです。");
				repeat = false;
			}


			if (m==8) {
				System.out.println("あいこです。");
				repeat = false;
			}
			m++;
		}
		scan.close();
	}
}

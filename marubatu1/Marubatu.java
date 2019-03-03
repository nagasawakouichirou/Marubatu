package marubatu1;

import java.util.Scanner;

public class Marubatu {
	public static void main(String[] args) {
		int[][] masu;
		masu = new int [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				masu[i][j] = 0;

			}
		}
		//0=空白
		String mark[] = {" ", "O", "X"};
        Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(masu[i][j]);
				if (j == 2) {
					continue;
				}
				if (masu[i][j] == 0) {
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
			int a;
			if (m % 2 == 0) {
				System.out.println("o" + "の番です");
				a = 1;
			} else {
				System.out.println("x" + "の番です");
				a = -1;
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
			if(masu[number1][number2] != 0) {
				System.out.println("すでに石が置いてあります。もう一度入力してください");
				continue;

			}

			masu[number1][number2] = a;
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
			for (int s = 0; s < 3; s++) {
				for(int b = 0; b < 3; b++) {


				if (masu[s][0] != 0) {
				}
				if (masu[s][0] != 0) {
				}
				if (masu[s][0] != 0) {
				}

				if (masu[s][3] == 3) {
					System.out.println('o' + "の勝ちです。");
					repeat = false;
				} else if (masu[s][3] == -3) {
					System.out.println('x' + "の勝ちです。");
					repeat = false;
				}
			}


			// 縦の判定

			for (int a1 = 0; a1 < 3; a1++) {
				for(int b = 0; b < 3; b++) {

				if (masu[0][b] != 0) {
		        }
				if (masu[1][b] != 0) {
				}
				if (masu[2][b] != 0) {
				}

				if (masu[3][b] == 3) {
					System.out.println('o' + "の勝ちです。");
					repeat = false;
				} else if (masu[3][b] == -3) {
					System.out.println('x' + "の勝ちです。");
					repeat = false;
				}
			}

			// 斜めの判定 1
				for (int a2 = 0; a2 < 3; a2++) {
					for(int b = 0; b < 3; b++) {

						int no1 [][] = new int[a1][b];

					if (masu[a2][b] != 0) {
					}
					if (masu[a2][b] != 0) {
					}
					if (masu[a2][b] != 0) {
					}

					if (masu[a2][b] == 3) {
						System.out.println('o' + "の勝ちです。");
						repeat = false;
					} else if (masu[a2][b] == -3) {
						System.out.println('x' + "の勝ちです。");
						repeat = false;
					}
				}

			// 斜めの判定 2
			for (int a3 = 0; a3 < 3; a3++) {
				for(int b = 0; b < 3; b++) {
					}

				if (masu[0][2] != 0) {
				}
				if (masu[1][1] != 0) {
				}
				if (masu[2][0] != 0) {
				}
				if (masu[3][3] == 3) {
					System.out.println('o' + "の勝ちです。");
					repeat = false;
				} else if (masu[3][3] == -3) {
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

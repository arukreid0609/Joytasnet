package day14;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args){
		// 最高得点と一覧表の幅
		int maxScore = 50;
		int width = maxScore + 10;

		// 受験人数を決める
		System.out.print("■受験人数(1～9人)を入力してください:");
		int num = new Scanner(System.in).nextInt();

		// scoreを決める
		int[] scores = new int[num];
		Random r = new Random();
		for (int i = 0;i<scores.length;i++) {
			scores[i] = r.nextInt(maxScore + 1);
		}

		// 採点結果 一覧表を表示
		printLine(width);
		System.out.println("■採点結果 一覧表");
		printLine(width);

		printScore(scores);
		printScale(maxScore);
	}

	public static void printLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void printScale(int num) {
		for (int i = 0; i < 9; i++) {
			System.out.print("-");
		}

		// 目盛り１０ごとに＋を表示
		for (int i = 0; i <= num; i++) {
			String s = i % 10 == 0 ? "+" : "-";
			System.out.print(s);
		}

		System.out.println();

		// 目盛りの下に数字を表示
		for (int i = -9; i <= num; i++) {
			String s = (i % 10 == 0) ? (i + "") : " ";
			System.out.printf(s);
			// 数字二桁表示した時の処理
			if (s.length() == 2) {
				i++;
			}
		}
	}

	// 受験者の点数を表示
	public static void printScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s  |", "受験者" + (i+1));
			for (int j = 1; j <= scores[i]; j++) {
				String s = j % 10 == 0 ? "+" : "*";
				System.out.print(s);
			}
			System.out.println(" "+scores[i] + "点");
		}
	}
}

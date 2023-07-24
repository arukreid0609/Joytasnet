package day7;

import java.util.Random;
import java.util.Scanner;

public class Janken {

	public static void main(String[] args) {
		String[] hands = { "グー", "チョキ", "パー" };
		System.out.println("ジャンケンゲーム!!");
		while (true) {
			System.out.print("手を入力してね。0:グー,1:チョキ,2:パー > ");
			int mySelect = new Scanner(System.in).nextInt();
			System.out.println("あなたは" + hands[mySelect]);
			int pcSelect = new Random().nextInt(3);
			System.out.println("PCは" + hands[pcSelect]);

			if (mySelect == pcSelect) {
				System.out.println("あいこです");
				continue;
			} else if ((mySelect + 1) % 3 == pcSelect % 3) {
				System.out.println("あなたの勝ち");
				break;
			} else {
				System.out.println("PCの勝ち");
				break;
			}

		}

	}

}

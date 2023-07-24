package day7;

import java.util.Random;
import java.util.Scanner;

public class HitNumber {

	public static void main(String[] args) {
		int correct = new Random().nextInt(101);
		int count = 0;
		System.out.println("数当てゲーム！！");

		while(true) {
			count++;
			System.out.print("いくつかな？(0～100)>");
			int answer = new Scanner(System.in).nextInt();
			if(answer == correct) {
				System.out.println("正解！" + count + "回で正解しました。");
				break;
			}else if(answer > correct) {
				System.out.println("もっと下だよ");
			}else {
				System.out.println("もっと上だよ");
			}
		}

	}

}

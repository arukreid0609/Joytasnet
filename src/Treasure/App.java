package Treasure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		// 必要な変数準備
		int maxGold = readData("result.txt");
		int count = 0;
		int gold = 0;
		final int CLEAR = 7;
		final int MISS = 4;

		// ゲーム開始
		System.out.println("前回までの最高金額:" + maxGold + "G");
		System.out.print("Press Enter Key");
		while (true) {
			new java.util.Scanner(System.in).nextLine();

			// ゲーム進行に必要な計算や処理
			int r = new Random().nextInt(10) + 1;
			int getGold = r * 1000;
			gold += getGold;
			count++;

			// 結果表示
			System.out.printf("%d回目:%dG発見！", count, getGold);

			// クリア判定
			if (r == CLEAR) {
				System.out.printf("\n脱出成功！%dG獲得した！\n", gold);
				// 最高金額を越えたら
				if (gold > maxGold) {
					writeData("result.txt", gold);
				}
				break;
			}

			// 失敗判定
			if (r == MISS) {
				System.out.printf("\n%dG抱えて地雷を踏んだので終了です。。。\n", gold);
				gold = 0;
				break;
			}
		}
	}

	// 前回までの最高金額を読み込み
	public static int readData(String path) {
		int maxGold = 0;
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			maxGold = Integer.parseInt(line);
			br.close();
		} catch (IOException e) {
			System.out.println("記録はありません");
		}
		return maxGold;
	}

	// 最高金額の更新書き込み
	public static void writeData(String path, int gold) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(String.valueOf(gold));
			bw.close();
		} catch (IOException e) {
			;
		}
	}
}

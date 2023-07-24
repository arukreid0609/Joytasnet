package day22;

import java.util.Scanner;
public class CopyMachineApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("最初に給紙する枚数を入力してください > ");
		int sheet = sc.nextInt();
		CopyMachine cm = new CopyMachine(sheet);

		while (true) {
			System.out.print("1.給紙 / 2.コピー /3.表示  / 4.終了 >");
			int selectMenu = sc.nextInt();

			switch (selectMenu) {
			case 1:
				System.out.print("給紙する枚数を入力して下さい > ");
				sheet = sc.nextInt();
				cm.feedPaper(sheet);
				break;
			case 2:
				System.out.print("コピーする枚数を入力して下さい > ");
				sheet = sc.nextInt();
				cm.copy(sheet);
				break;
			case 3:
				cm.display();
				break;
			case 4:
				System.out.println("アプリケーションを終了します。");
				return;
			default:
				System.out.println("メニューに無い選択肢です。");
			}
			System.out.println();
		}
	}
}

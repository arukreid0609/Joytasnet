package day32;

import java.util.Scanner;

public class PCApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PC pc = new PC();
		// 変更点
		UsbConnectable[] devices = {
				new Mouse(),
				new Memory(),
				new CardReader()
		};

		while (true) {
			System.out.print("0.アプリ実行,1.USBデバイス接続,2.終わり>");
			int select = scan.nextInt();
			switch (select) {
			case 0:
				pc.execApp();
				break;
			case 1:
				System.out.print("どのデバイスを接続しますか0.マウス、1.メモリー、2.カードリーダー>");
				int deviceSelect = scan.nextInt();
				// 変更点
				if (0 <= deviceSelect && deviceSelect < devices.length) {
					pc.setDevice(devices[deviceSelect]);
					pc.usb();
				} else {
					System.out.println("そのようなデバイスはありません。");
				}
				break;
			case 2:
				System.out.println("アプリケーションを終了します。");
				return;
			default:
				System.out.println("メニューにその選択肢は存在しません。");
			}
		}
	}
}

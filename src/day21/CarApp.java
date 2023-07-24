package day21;

import java.util.Scanner;
public class CarApp {
	public static void main(String[] args) {
		Car car = new Car(30.0,8.4,60.0);
		Scanner sc = new Scanner(System.in);

		System.out.println("【実行結果】");
		while (true) {
			System.out.print("1.走行 /2.給油 /3.残量表示 /4.終了 > ");
			int select = new Scanner(System.in).nextInt();
			switch (select) {
			case 1:
				System.out.print("何キロ走行しますか > ");
				double distance = sc.nextDouble();
				car.run(distance);
				break;
			case 2:
				System.out.print("何リットル給油しますか > ");
				double fuel = sc.nextDouble();
				car.addFuel(fuel);
				break;
			case 3:
				car.displayFuel();
				break;
			case 4:
				System.out.println("アプリケーションを終了します");
				return;
			default:
				System.out.println("メニューに無い選択肢です");
			}
			System.out.println();
		}
	}
}

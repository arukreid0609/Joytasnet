package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlimeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Slime> list = new ArrayList<>();
		while (true) {
			System.out.print("スライムを追加する？(1…yes,2…no):");
			int input = sc.nextInt();
			if (input != 1) {
				break;
			}
			System.out.print("追加するスライムの名前を決めてね:");
			String name = sc.next();
			Slime slime = new Slime(name);
			slime.appear();
			list.add(slime);
		}

		// 拡張for文使った例
		for (Slime s : list) {
			s.attack();
		}

		// for文使った例
		//		for(int i=0;i<list.size();i++){
		//			list.get(i).attack();
		//		}
	}
}

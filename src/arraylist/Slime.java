package arraylist;

public class Slime {
	String name;

	Slime(String name) {
		this.name = name;
	}

	void appear() {
		System.out.printf("%sが現れた！！%n", this.name);
	}

	void attack() {
		System.out.printf("%sの攻撃：5ポイントのダメージを与えた！%n", this.name);
	}

}

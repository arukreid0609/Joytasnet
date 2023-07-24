package day22;

public class CopyMachine {
	int paper;

	public CopyMachine(int sheet) {
		this.paper = sheet < 0 ? 0 : sheet;
	}

	public void feedPaper(int sheet) {
		this.paper += sheet;
		System.out.printf("%d枚給紙しました。\n", sheet);
	}

	public void copy(int sheet) {
		int copy = paper - sheet >= 0 ? sheet : paper;
		paper -= copy;
		System.out.printf("%d枚コピーしました。\n", copy);
	}

	public void display() {
		System.out.printf("コピー可能な枚数は%d枚です。\n", paper);
	}
}

package day32;

public class Memory implements UsbConnectable {
	@Override
	public void usbConnect() {
		System.out.println("USB接続にてデータを接続できます。");
	}
}

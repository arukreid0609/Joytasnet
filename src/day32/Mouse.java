package day32;

public class Mouse implements UsbConnectable {
	@Override
	public void usbConnect() {
		System.out.println("USB接続にてマウス操作ができます。");
	}
}

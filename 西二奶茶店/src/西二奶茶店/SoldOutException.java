package 西二奶茶店;

public class SoldOutException extends Exception{
	String msg;
	public SoldOutException() {}
	public SoldOutException(String msg) {
		this.msg=msg;
	}
	public void printMessage()
	{
		System.out.println(this.msg);
		System.out.println("正在为您进货...");
	}
}

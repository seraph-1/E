package 西二奶茶店;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		TeaShop teashop = new TeaShop();
		Scanner scanner =new Scanner(System.in);
		int i;
		while(true)
		{
			System.out.println("欢迎来到西二奶茶店 选择你需要的服务");
			System.out.println("1.珍珠奶茶");
			System.out.println("2.椰果奶茶");
			System.out.println("3.愉快的学习六天");
			System.out.println("4.离开");
			i=scanner.nextInt();
			try
			{
				if(i==1)teashop.SellMilktea("珍珠奶茶", "Bubble");
				else if(i==2)teashop.SellMilktea("椰果奶茶", "Coconut");
				else if(i==3)teashop.AddDate(6);
				else if(i==4)break;
			}
			catch(SoldOutException e)
			{
				e.printMessage();
			}
		}
		scanner.close();
	}

}

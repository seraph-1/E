package �����̲��;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		TeaShop teashop = new TeaShop();
		Scanner scanner =new Scanner(System.in);
		int i;
		while(true)
		{
			System.out.println("��ӭ���������̲�� ѡ������Ҫ�ķ���");
			System.out.println("1.�����̲�");
			System.out.println("2.Ҭ���̲�");
			System.out.println("3.����ѧϰ����");
			System.out.println("4.�뿪");
			i=scanner.nextInt();
			try
			{
				if(i==1)teashop.SellMilktea("�����̲�", "Bubble");
				else if(i==2)teashop.SellMilktea("Ҭ���̲�", "Coconut");
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

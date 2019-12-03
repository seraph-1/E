package �����̲��;

import java.util.Calendar;

public class Coconut extends Ingredient{
	protected String name;
	protected Calendar date;
	protected int keepday;
	public String toString()
	{
		return "������Ϊ��"+name+"\n��������Ϊ��"+date.get(Calendar.YEAR)+"."+(date.get(Calendar.MONTH)+1)+"."+date.get(Calendar.DAY_OF_MONTH)+"\n������Ϊ��"+keepday;
	}
	public boolean dayIsOut(Calendar today)
	{
		if((today.getTimeInMillis()-date.getTimeInMillis())/(1000*60*60*24)>keepday)
			return true;
		else return false;
	}
	Coconut()
	{
		name="Ҭ��";
		date=Calendar.getInstance();
		keepday=5;
	}
	Coconut(Calendar today)
	{
		name="Ҭ��";
		date=(Calendar)today.clone();
		keepday=5;
	}
}

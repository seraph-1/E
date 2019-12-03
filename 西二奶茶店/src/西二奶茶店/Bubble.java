package �����̲��;

import java.util.Calendar;

public class Bubble extends Ingredient{
	protected String name;
	protected Calendar date;
	protected int keepday;
	public String toString()
	{
		return "������Ϊ��"+name+"\n��������Ϊ��"+date.get(Calendar.YEAR)+"."+(date.get(Calendar.MONTH)+1)+"."+date.get(Calendar.DAY_OF_MONTH)+"\n������Ϊ��"+keepday;
	}
	public boolean dayIsOut(Calendar today)
	{
		if(((today.getTimeInMillis()-date.getTimeInMillis())/(1000*60*60*24))>keepday)
			return true;
		else return false;
	}
	Bubble()
	{
		name="����";
		date=Calendar.getInstance();
		keepday=7;
	}
	Bubble(Calendar today)
	{
		name="����";
		date=(Calendar)today.clone();
		keepday=7;
	}
	
}

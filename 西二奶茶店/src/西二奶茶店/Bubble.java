package 西二奶茶店;

import java.util.Calendar;

public class Bubble extends Ingredient{
	protected String name;
	protected Calendar date;
	protected int keepday;
	public String toString()
	{
		return "配料名为："+name+"\n生产日期为："+date.get(Calendar.YEAR)+"."+(date.get(Calendar.MONTH)+1)+"."+date.get(Calendar.DAY_OF_MONTH)+"\n保质期为："+keepday;
	}
	public boolean dayIsOut(Calendar today)
	{
		if(((today.getTimeInMillis()-date.getTimeInMillis())/(1000*60*60*24))>keepday)
			return true;
		else return false;
	}
	Bubble()
	{
		name="珍珠";
		date=Calendar.getInstance();
		keepday=7;
	}
	Bubble(Calendar today)
	{
		name="珍珠";
		date=(Calendar)today.clone();
		keepday=7;
	}
	
}

package 西二奶茶店;

import java.util.Calendar;

public abstract class Ingredient {
	protected String name;
	protected Calendar date;
	protected int keepday;
	public abstract boolean dayIsOut(Calendar today);
	public String toString()
	{
		return "配料名为："+name+"\n生产日期为："+date.get(Calendar.YEAR)+"."+(date.get(Calendar.MONTH)+1)+"."+date.get(Calendar.DAY_OF_MONTH)+"\n保质期为："+keepday;
	}
}
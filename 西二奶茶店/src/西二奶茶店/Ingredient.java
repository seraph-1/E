package �����̲��;

import java.util.Calendar;

public abstract class Ingredient {
	protected String name;
	protected Calendar date;
	protected int keepday;
	public abstract boolean dayIsOut(Calendar today);
	public String toString()
	{
		return "������Ϊ��"+name+"\n��������Ϊ��"+date.get(Calendar.YEAR)+"."+(date.get(Calendar.MONTH)+1)+"."+date.get(Calendar.DAY_OF_MONTH)+"\n������Ϊ��"+keepday;
	}
}
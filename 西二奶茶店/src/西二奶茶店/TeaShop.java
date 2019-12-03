package Î÷¶þÄÌ²èµê;

import java.util.ArrayList;
import java.util.Calendar;

public class TeaShop implements Shop{
	ArrayList<Bubble> bubble;
	ArrayList<Coconut> coconut;
	Calendar day=Calendar.getInstance();
	TeaShop()
	{
		bubble=new ArrayList<Bubble>();
		Add(new Bubble(day));
		coconut=new ArrayList<Coconut>();
		Add(new Coconut(day));
	}
	public void AddDate(int n)
	{
		day.add(Calendar.DAY_OF_YEAR,n);
	}
	public void AddIngredient(Ingredient obj)
	{
		if(obj instanceof Bubble)Add(new Bubble(day));
		else Add(new Coconut(day));
		
	}
	private void Add(Bubble bb)
	{
		int i;
		for(i=0;i<5;i++)
		{
			bubble.add(bb);
		}
	}
	private void Add(Coconut ccn)
	{
		int i;
		for(i=0;i<5;i++)
		{
	 		coconut.add(ccn);
		}
	}
	public void SellMilktea(String milkName,String ingredientName) throws SoldOutException
	{
		if(ingredientName.equals("Bubble"))
		{
			if(bubble.isEmpty()) 
			{
				SoldOut(ingredientName);
				throw new SoldOutException("ÕäÖéÄÌ²èÂô¹âÁÉ");
			}
			if(bubble.get(0).dayIsOut(day))
			{
				OutTime(ingredientName,day);
				if(bubble.isEmpty())SoldOut(ingredientName);
				throw new SoldOutException("ÇëÉÔµÈ");
			}
			System.out.println(bubble.get(0).toString());
			bubble.remove(0);
			System.out.println("ÕâÊÇÄúµÄÕäÖéÄÌ²è");
		}
		else if(ingredientName.equals("Coconut"))
		{
			if(coconut.isEmpty()) 
			{
				SoldOut(ingredientName);
				throw new SoldOutException("Ò¬¹ûÄÌ²èÂô¹âÁÉ");
			}
			if(coconut.get(0).dayIsOut(day)) 
			{
				OutTime(ingredientName,day);
				if(coconut.isEmpty())SoldOut(ingredientName);
				throw new SoldOutException("ÇëÉÔµÈ");
			}
			System.out.println(coconut.get(0).toString());
			coconut.remove(0);
			System.out.println("ÕâÊÇÄúµÄÒ¬¹ûÄÌ²è");
		}
	}
	public void OutTime(String ingredientName,Calendar today)
	{
		if(ingredientName.equals("Bubble"))
		{
			int i,j=0;
			while(true)
			{
				for(i=j;i<bubble.size();i++)
				{
					if(bubble.get(i).dayIsOut(today))
						{
							bubble.remove(i);
							break;
						}
				}
				j=i;
				if(i==bubble.size())break;
			}
		}
		else if(ingredientName.equals("Coconut"))
		{
			int i,j=0;
			while(true)
			{
				for(i=j;i<coconut.size();i++)
				{
					if(coconut.get(i).dayIsOut(today))
						{
							coconut.remove(i);
							break;
						}
				}
				j=i;
				if(i==coconut.size())break;
			}
		}
	}
	public void SoldOut(String ingredientName)
	{
		if(ingredientName.equals("Bubble"))
		{
			AddIngredient(new Bubble());
		}
		else if(ingredientName.equals("Coconut"))
		{
			AddIngredient(new Coconut());
		}
	}
}

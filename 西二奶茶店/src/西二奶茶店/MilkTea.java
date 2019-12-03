package Îק¶‏ÄÌ²טµך;

public class MilkTea {
	private String name;
	private Ingredient jialiao;
	MilkTea(Ingredient obj)
	{
		name=obj.name+"ÄÌ²ט";
		jialiao=obj;
	}
	public String toString()
	{
		return name+jialiao.toString();
	}
}

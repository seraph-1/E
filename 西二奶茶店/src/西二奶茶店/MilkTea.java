package �����̲��;

public class MilkTea {
	private String name;
	private Ingredient jialiao;
	MilkTea(Ingredient obj)
	{
		name=obj.name+"�̲�";
		jialiao=obj;
	}
	public String toString()
	{
		return name+jialiao.toString();
	}
}

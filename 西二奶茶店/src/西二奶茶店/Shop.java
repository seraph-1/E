package Î÷¶þÄÌ²èµê;


public interface Shop {
	void AddIngredient(Ingredient obj);
	void SellMilktea(String milkName,String ingredientName) throws SoldOutException;
}

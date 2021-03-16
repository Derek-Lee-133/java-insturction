import java.util.ArrayList;

public class Item {

	private String Name;
	private int SellIn;
	private int Quality;

	public Item() {
		super();
	}

	public Item(String name, int sellIn, int quality) {
		super();
		Name = name;
		SellIn = sellIn;
		Quality = quality;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSellIn() {
		return SellIn;
	}

	public void setSellIn(int sellIn) {
		SellIn = sellIn;
	}

	public int getQuality() {
		return Quality;
	}

	public void setQuality(int quality) {
		Quality = quality;
	}

	// printing array of Item
	@Override
	public String toString() {
		return String.format("Inventory" + "\n" + "Name: " + Name + "\n" + "Sellin: " + SellIn + "\n" + "Quality: "
				+ Quality + "\n");
	}

	public static void  updateQuality(ArrayList Items) {
		Items = Items[];
		
		for (Items i = 0; i < Items.Count; i++)
		{
			if (Items[i].name = "Conjured") {
				Items[i].Quality = Items[i].Quality -2;
			}
		
			if (Items[i].Name != "Aged Brie" && Items[i].Name != "Backstage Passes")
		{
				if (Items[i].Quality > 0)
		{
		if (Items[i].Name != "Sulfuras")
		{
		Items[i].Quality = Items[i].Quality - 1;
		}
		
		}
		}
		else
		{
		if (Items[i].Quality < 50)
		{
		Items[i].Quality = Items[i].Quality + 1;
		if (Items[i].Name == "Backstage Passes")
		{
		if (Items[i].SellIn < 11)
		{
		if (Items[i].Quality < 50)
		{
		Items[i].Quality = Items[i].Quality + 1;
		}
		}

	}

}
		if (Items[i].SellIn < 6)
		{
			if (Items[i].Quality < 50)
			{
			Items[i].Quality = Items[i].Quality + 1;
			}
			 }
			}
			}
			
			if (Items[i].Name != "Sulfuras")
			{
			Items[i].SellIn = Items[i].SellIn - 1;
			}
			if (Items[i].SellIn < 0)
			{
			if (Items[i].Name != "Aged Brie")
			{
			if (Items[i].Name != "Backstage passes")
			{
			if (Items[i].Quality > 0)
			{
			if (Items[i].Name != "Sulfuras")
			{
			Items[i].Quality = Items[i].Quality - 1;
			}
			}
			}
			else
			{
			Items[i].Quality = Items[i].Quality - Items[i].Quality;
		}
			}
			else
			{
			if (Items[i].Quality < 50)
			{
			Items[i].Quality = Items[i].Quality + 1;
			}
			}
			}
	}

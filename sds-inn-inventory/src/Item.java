
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
		return String.format("Inventory" + "\n" + "Name: " + Name + "\n" +
	"Sellin: " + SellIn + "\n"+ "Quality: " + Quality + "\n");
	}

}

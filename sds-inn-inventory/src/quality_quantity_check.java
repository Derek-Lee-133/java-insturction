import java.util.ArrayList;
import java.util.List;

public class quality_quantity_check {

	public static void main(String[] args) {

		Item item1 = new Item("+5 Dexterity Vest", 10, 20);
		Item item2 = new Item("Aged Brie", 2, 0);
		Item item3 = new Item("Elixir of the Mongoose", 5, 7);
		Item item4 = new Item("Sulfuras", 0, 80);
		Item item5 = new Item("Backstage passes", 15, 20);
		Item item6 = new Item("Conjured", 3, 6);

		List<Item> Items = new ArrayList<Item>();
		Items.add(item1);
		Items.add(item2);
		Items.add(item3);
		Items.add(item3);
		Items.add(item4);
		Items.add(item5);
		Items.add(item6);
		
		System.out.println(Items);
	


	
	}
}

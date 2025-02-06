package Demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
				
		List<String> fruits = new ArrayList<String>();					
		
		fruits.add("Fruit.Apple.Green");
		fruits.add("Fruit.Apple.Fuji");
		fruits.add("Fruit.Apple.Gala");
		fruits.add("Fruit.Pear.Asian");
		fruits.add("Fruit.Pear.Newzealand");
		fruits.add("Fruit.Apple.Indian.Shimla");
	
		System.out.println(fruits.get(1).split("Fruit"));
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
			
			
		}
			
			
			
		
	}
}
	
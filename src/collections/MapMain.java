package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, String> myMap = new HashMap<String, String>();
		myMap.put("thomas", "le formateur");
		myMap.put("m2i", "le centre de formation");
		
		HashMap<String, String> colors = new HashMap<String, String>();
		colors.put("white", "#FFFFFF");
		colors.put("black", "#000000");
		colors.put("red", "#FF0000");
		colors.put("green", "#00FF00");
		colors.put("green", "vert"); // écrase la declaration précédente
		
		System.out.println(colors.get("green"));
		for (Entry<String, String> entry : colors.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}


	}

}

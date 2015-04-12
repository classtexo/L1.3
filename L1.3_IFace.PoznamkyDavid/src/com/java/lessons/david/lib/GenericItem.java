package com.java.lessons.david.lib;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GenericItem implements iFaceReadableVer2{
	public void readText(String jsonItem) {
		System.out.println("Inner print : " + this.getClass().getName());
		
		try {
			JSONObject json = (JSONObject)new JSONParser().parse(jsonItem);
			Object itemObj= null; // <<< David - je to OK?
			
			switch (json.get("itemType").toString()) {

              case "b":  itemObj = new Book();
                         ((Book) itemObj).readText(jsonItem);
                         break;
              case "m":  itemObj = new Magazine();
                         ((Magazine) itemObj).readText(jsonItem);
                         break;
              case "n":  itemObj = new NewsPaper();
                         ((NewsPaper) itemObj).readText(jsonItem);
                         break;
              default:   System.out.println("Neznamy typ polozky!");
                         break;
             }
			
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("JSON Parser error! Typ nenalezen!");
		} finally {System.out.println("\n");}
		
	}
	
	public void showItemType(String jsonItem) {
		try {
			System.out.println(jsonItem);
			JSONObject json = (JSONObject)new JSONParser().parse(jsonItem);
			System.out.println("Detekce : polozka typu : " + json.get("itemType").toString());
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Detekce : polozku nebylo mozne rozpoznat");
		} finally {System.out.println("\n");}		
	}
}


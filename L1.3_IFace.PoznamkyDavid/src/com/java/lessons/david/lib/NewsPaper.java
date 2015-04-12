package com.java.lessons.david.lib;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Deprecated
public class NewsPaper implements IfaceReadable {

	@Override   // << tohle mi tam naskocilo samo!
	public void readText(String jsonItem) {
		System.out.println("Inner print : " + this.getClass().getName() + "\nText of NEWSPAPER");
		
		try {
			JSONObject json = (JSONObject)new JSONParser().parse(jsonItem);
			System.out.println("Newspaper name : " + json.get("name"));
			System.out.println("Naklad         : " + json.get("naklad"));
			System.out.println("Press agency   : " + json.get("press_house"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("JSON Parser error!");
		} finally {System.out.println("\n");}
		
		
		
	}

}


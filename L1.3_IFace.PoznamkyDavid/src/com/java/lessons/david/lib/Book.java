package com.java.lessons.david.lib;

import org.json.simple.*;
import org.json.simple.parser.*;

@Deprecated
public class Book implements IfaceReadable {

	@Override   // << tohle mi tam naskocilo samo!
	public void readText(String jsonItem) {
		
		System.out.println("Inner print : " + this.getClass().getName() + "\nText of BOOK");
		
		try {
			JSONObject json = (JSONObject)new JSONParser().parse(jsonItem);
			System.out.println("Book name      : " + json.get("name"));
			System.out.println("Author         : " + json.get("author"));
			System.out.println("Publisher      : " + json.get("publisher"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("JSON Parser error!");
		} finally {System.out.println("\n");}
		
		
		
	}

}


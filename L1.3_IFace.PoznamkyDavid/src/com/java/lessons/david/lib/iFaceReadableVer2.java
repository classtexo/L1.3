package com.java.lessons.david.lib;

import com.java.lessons.david.lib.IfaceReadable;

//Jak to normalne funguje - udelam extend a pak po vyrazeni dam signatury 
// z prvni verze sem? Nebo rovnou dam vsechny signatury sem?

public interface iFaceReadableVer2 extends IfaceReadable {
	public void showItemType(String jsonItem);
}


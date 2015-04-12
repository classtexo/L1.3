package com.java.lessons.david;

import com.java.lessons.david.lib.Book;
import com.java.lessons.david.lib.GenericItem;
import com.java.lessons.david.lib.IfaceReadable;
import com.java.lessons.david.lib.Magazine;
import com.java.lessons.david.lib.NewsPaper;
import com.java.lessons.david.lib.constants;
import com.java.lessons.david.lib.iFaceReadableVer2;

/*1. definuj interface(rozhrani) IReadable s public metodou readText()
  2. vytvor tridy, ktere implementuji rozhrani IReadable:
     Newspaper (metoda readText vypíše "Text of newspaper")
     Magazine (metoda readText vypíše "Text of magazine")
     Book (metoda readText vypíše "Text of book")
  3. Vytvoř nové objekty, které jsou přechozích typů, zavolej na nich tyto metody.*/

/*Ucel rozsireni prikladu je rozlisit implementace pro ruzne typy polozek
  ktere se zpracovavaji temer stejne, pouze dle typu se zpracovavaji jina struktura atributu
  vedenych u polozek (napr. kniha nema periodicitu, newspaper nema autora.
  INTERFACE - zavazny list implementaci pro zpracovani polozek
              s vyctem signatur
  IMPLEMENTACE - pro kazdy typ pouzita trida s upravenou implementaci ktera
                 pracuje se specifickymi atributy daneho typu            
  */

/*Zaver:
	Interface je zavazne API ktere kdyz se pouzije vyzaduje implementaci vsech metod. 
	Vyuziti - zafixuji s s kolegy API, implemetace se ale muzou menit (meni se casto)
	Kdyz pak je treba aktualizace/fix, zmeni se jednoduse jen implementace. Tzn udelam novou
	tridu, ktera to bude resit po novem, ale ten dulezity stycny bod, interface zaruci,
	ze se to bude propojovat bez problemu.
	Pokud se ale udela nova (dodatecne) funkcionalita, kterou je treba vytknout pres Interface, vytvori
	se nevy iterface ktery "extend" stary Iface a do noveho se prida nova signatura

*/

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Java started...\n");
    
	 // Constructors << takto spatne jsem to mel. Misto typu (Class) jsem 
	 // mel pouzivat (Interface)	
/*		Book bookObj           = new Book();
		Magazine magazineObj   = new Magazine();
		NewsPaper newsPaperObj = new NewsPaper();*/

		// Tady pouze na jedmom miste si muzu prepinat implementace 
		// Pouziti Verze I. jeste se neurcovalo samo, o jaky typ zaznamu jde
		// Dal jse Anotaci Deprecated. Zde to nechavam
		IfaceReadable bookObj = new Book();
		IfaceReadable magazineObj = new Magazine();
		IfaceReadable newsPaperObj = new NewsPaper();
		
		bookObj.readText(     constants.JSON_BOOK_ITEM     );
		magazineObj.readText( constants.JSON_MAGAZINE_ITEM );
		newsPaperObj.readText(constants.JSON_NEWSPAPER_ITEM);
		
/*	    Overloading - NASTUDOVAT / Muzu predavat ruzne parametry do tohoto minimalniho konstruktoru
	    Muzu si udelat nekolik konstruktoru tridy (nutne maji stejne jemno). Muzu ale potrebovat to,
		ze konstruktor budu volat nekolika zpusoby - rozdilny pocet parametru a datovych typu.
        Overloading se bere v potaz pri kompilaci (Override runtime) a muzu mit rozdily v typech, poctu
        nemuzu zmenit jen return typ!*/
		
		System.out.println("nyni to nove");
		iFaceReadableVer2 gItem = new GenericItem();
		gItem.readText(constants.JSON_BOOK_ITEM ); 
		
		gItem.showItemType(constants.JSON_BOOK_ITEM ); 
		
	}

}



/*JSONObject json = (JSONObject)new JSONParser().parse("{\"name\":\"MyNode\", \"width\":200, \"height\":100}");
System.out.println("name=" + json.get("name"));
System.out.println("width=" + json.get("width"));*/

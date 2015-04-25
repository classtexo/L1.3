package com.java.lessons.david.lib;

/*1. definuj interface(rozhrani) IReadable s public metodou readText()
2. vytvor tridy, ktere implementuji rozhrani IReadable:
   Newspaper (metoda readText vypíše "Text of newspaper")
   Magazine (metoda readText vypíše "Text of magazine")
   Book (metoda readText vypíše "Text of book")
3. Vytvoř nové objekty, které jsou přechozích typů, zavolej na nich tyto metody.*/

@Deprecated
public interface IfaceReadable {
  public void readText(String jsonItem);

  //Muzou byt jen staticke - tzn Konstanty
  //"static" znamena ze je to dostupne v kontextu bez "instantiate" (tzn bez konstruktoru) 
  public static String TEST_STATIC = "test ahoj";  
  
//void readText(String jsonItem);    
  
/*  Doprkynka, k cemu je to dobre, to je fakt jen abych vydefinoval co si mam vsechno naprogramovat?
    Vylozene mi unika ucel proc si tady pisu na co nemam zapomet.	*/	  
  
}

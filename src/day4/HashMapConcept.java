package day4;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapConcept {

	
	
	public static void main(String[] args) {
		
		HashMap<String, String> hMap=new HashMap<>();
		
		Hashtable<String, String> hashtable= new Hashtable<>();
		
		
		hMap.put("Name", "Bala");
		hMap.put("age", "30");
		hMap.put("Name1", "praveen");
	
		
		System.out.println(hMap.keySet());
		
		System.out.println(hMap.entrySet());
		
		System.out.println(hMap.get("Name"));
		//hMap.clear();
		hMap.remove("Name1");
		System.out.println(hMap.entrySet());
		
		
	}
	
	
}

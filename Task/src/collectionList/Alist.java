package collectionList;

import java.util.ArrayList;
import java.util.Collections;

public class Alist {

	public static void main(String[] args) {

		ArrayList<String>cars = new ArrayList<String>();
		cars.add("Volvo");      //AddItem
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Collections.sort(cars);// SortingItem
		 
		System.out.println(cars);
		
		for (String i : cars) {        //Loop through ArrayList
		      System.out.println(i);
		    }
		
		System.out.println(cars.get(1)); //getItem
		
		cars.set(3, "Audi");             //ChangeItem
		System.out.println(cars);  
		
		cars.remove(0);                  //DeleteItem
		System.out.println(cars);
		
		System.out.println(cars.size());  //ListSize
	}
}



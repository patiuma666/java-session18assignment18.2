package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListofHdtv {
	//creating main class named as ArrayListofHdtv
	
	public static void main(String[] args) {
		//creating main method
		
		//Created an array-list object  of HDTV 
		List<HDTV> list= new ArrayList<HDTV>();
		
		//By using add method we have added three objects of HDTV list
	    list.add(new HDTV("Samsung",32));
	    list.add(new HDTV("Samsung",48));
	    list.add(new HDTV("Samsung",25));
	    
	    
	    //Calling the sort method from the collection class
	    Collections.sort(list,new Inches());
	    System.out.println("sorting based on length");
	    //Applying for-each loop
	    for(HDTV dis:list){
	    	System.out.println(dis);

	}

	}

}

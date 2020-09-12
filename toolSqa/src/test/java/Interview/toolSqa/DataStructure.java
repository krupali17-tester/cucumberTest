package Interview.toolSqa;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.jar.Attributes.Name;

import org.testng.internal.junit.ArrayAsserts;

public class DataStructure{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//LinkedList<String> list = new LinkedList<String>();
		ArrayList<String> list = new ArrayList<String>();
	list.add("Nikunj");
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	
	System.out.println(list.isEmpty());
	System.out.println(list.iterator().hasNext());
	//System.out.println(" " +list.iterator().next()+ " " +list.iterator().next()+ " " +list.iterator().next()+ "");
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext())	{
		String value = iterator.next();
		System.out.println(value);
		if(value.equals("Nikunj")){
			System.out.println("We have found specific value at location = " +list.indexOf("4"));
		}
	}
	
		
		/*List<String> mylist = new ArrayList<String>();
		mylist.add("Nikunj");
		mylist.add("1");
		mylist.add("2");
		mylist.add("3");
		
		for(String word : mylist){
			System.out.println(word);
			System.out.println();
		}*/
/*
		Hashtable<String, Integer> age = new Hashtable<String, Integer>();
		age.put("Nikunj", 24);
		age.put("Mohit", 25);
		age.put("Shashi", 26);
		
		/*while(!(age.isEmpty()))
				{
			
				}*/
		
		
		
		
			
		
	}

}

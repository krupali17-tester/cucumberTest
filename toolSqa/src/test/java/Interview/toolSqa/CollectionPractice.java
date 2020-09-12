package Interview.toolSqa;

import java.util.ArrayList;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> myList = new ArrayList<String>();
		int i=0;
		//i = myList.size();
		myList.add("Nikunj");
		myList.add("Parmar");
		
		myList.add("Hey");
		i = myList.size();
		System.out.println(i);
		
		
		myList.remove(0);		
		System.out.println(myList.get(0));
		
		
	}

}

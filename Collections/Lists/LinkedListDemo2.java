// Java program to demonstrate
// descendingIterator() method
// for String value

import java.util.*;

public class LinkedListDemo2 {
	public static void main(String[] argv)
		throws Exception
	{

		try {

			// creating object of TreeMap<Integer, String>
			LinkedList<String> list = new LinkedList<String>();

			// add some elements to list
			list.add("A");
			list.add("B");
			list.add("C");
            list.addLast("D");

			// print the linked list
			System.out.println("LinkedList:" + list);
			System.out.println( list.poll());

			// set Iterator as descending
			// using descendingIterator() method
			Iterator x = list.descendingIterator();
			

			// print list with descending order
			while (x.hasNext()) {
				System.out.println("Value is : "
								+ x.next());
			}
		}

		catch (NullPointerException e) {
			System.out.println("Exception thrown : "
							+ e);
		}
	}
}

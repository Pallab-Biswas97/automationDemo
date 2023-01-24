package javaAssiginment;

import java.util.ArrayList;
import java.util.List;

public class JavaQ10 {

	public static void main(String args[]) {
		
		        List<String> list1 = new ArrayList<String>();
		        list1.add("P");
		        list1.add("a");
		        list1.add("l");
		        list1.add("l");
		        list1.add("a");
		        list1.add("b");

		        List<String> list2 = new ArrayList<String>();
		        list2.add("B");
		        list2.add("i");
		        list2.add("s");
		        list2.add("w");
		        list2.add("a");
		        list2.add("s");
		        List<String> joined = new ArrayList<String>();

		        joined.addAll(list1);
		        joined.addAll(list2);

		        System.out.println("list1: " + list1);
		        System.out.println("list2: " + list2);
		        System.out.println("joined: " + joined);

		    }
	}


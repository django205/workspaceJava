package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class sd {

	public static void main(String [] args){
		ArrayList o=new ArrayList();
		o.add("yogi");
		o.add(12);
		o.add(2.33);
		o.add('f');
		o.add(0,"rohit");
	//	o.remove(0);
		int size=o.size();
		System.out.println(size);
		for(Object o1:o){
			System.out.println(o1);
		}
		
		Iterator itr=o.iterator();
		while(itr.hasNext()){     //boolean type either true or false
			System.out.println(itr.next());// next method is object type
		}
	}}
//collection is an interface
//collections is a class

//collections.sort(o);
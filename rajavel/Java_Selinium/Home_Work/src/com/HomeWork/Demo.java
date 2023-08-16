package com.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	

	
	
	public static void main(String[] args) {

		String s1 = "vijaykumar";
		String s5 ="vijaykumar";
		String s2 = "";
		String s3;
		char charAt = s1.charAt(5);
		System.out.println(charAt);
		
		 String concat = s1.concat(s5);

		String l = s1.toUpperCase();
		System.out.println(l);

		String o = s1.toLowerCase();
		System.out.println(o);

		boolean u = s1.isEmpty();
		System.out.println(u);

		boolean p = s2.isEmpty();
		System.out.println(p);

		boolean t = s1.startsWith("v");
		System.out.println(t);

		if (s1.startsWith("i"))
			System.out.println(true);
		else
			System.out.println(false);

		boolean w = s1.endsWith("r");

		System.out.println(w);
		
		boolean h = s1.contains("z");
		System.out.println(h);

		int l1 = s1.length();
		System.out.println(l1);
		
		String r = s1.replace("i", "x");
		System.out.println(r);
		
		int g = s1.indexOf("v");
		System.out.println(g);
		
		int c = s1.lastIndexOf("r");
		System.out.println(c);
		
		String x = s1.trim();
		System.out.println(x);
		
     String p1 = s1.substring(6);
     System.out.println(p1);
     
     String o1 = s1.substring(0, 5);
     System.out.println(o1);
		
     String[] s4 = s1.split("vijaykumar");
     for(String s8:s4) {
    	 
    	 System.out.println(s8);
     }
     
     if(s1==s5) {
    	 System.out.println(true);
     }
     
     boolean h1 = s1.equals("vijaykumar");
     System.out.println(h1);
     

		char ch ='A';
		int ascii=ch;
		System.out.println(ascii);
		  
	int h8 = s1.hashCode();
	System.out.println(h8);
	
	int h9 = s5.hashCode();
	System.out.println(h9);
	
	String r2= new String("raja");
	System.out.println(r2.hashCode());
	
	StringBuilder r3 = new StringBuilder("raja");
	System.out.println(r3.hashCode());
		  
 //string  null pointer and string	out bound expection
	
	//array    array out bound expection	
	char []g2=new char[10];
	
	g2[0]='v';
	g2[1]='i';
	g2[2]='j';
	g2[3]='a';
	g2[4]='y';
	g2[5]='k';
	g2[6]='u';
	g2[7]='m';
	g2[8]='a';
	g2[9]='r';
	System.out.println(g2.length);
	for(char ji:g2) {
		System.out.println(ji);
	}
	System.out.println();
	
	int i= 2345;
	float jh = i;
	System.out.println(jh);
	
	ArrayList<Object> arr=new ArrayList<>(); // <> genricks
	arr.add("rajavellll");
	arr.add("arun");
	arr.add("sathish");
	arr.add("senthil");
	arr.add("rajavel");
	System.out.println(arr);
	arr.add(0,"vishnu");
	System.out.println(arr);
    arr.set(0, "vijay");
	System.out.println(arr);
    arr.add("raj");
	System.out.println(arr);	System.out.println(arr.remove(0));
	System.out.println(arr);
	Object object = arr.get(0);
	System.out.println(object);
	
	int indexOf = arr.indexOf("raj");
	System.out.println(indexOf);
	
	int lastIndexOf = arr.lastIndexOf("rajavel");
	System.out.println(lastIndexOf);
	
	boolean empty = arr.isEmpty();
	System.out.println(empty);

	boolean contains = arr.contains("arun");
	System.out.println(contains);
	
	ArrayList<Object> arr1=new ArrayList<>();
	
	arr1.add("rajavellll");
	
	arr1.add("rubachandran");
	arr1.add("mahi");
	arr1.add("bala");
	arr1.add("rajavel");
	
	arr.addAll(arr1);
	System.out.println(arr);
	
	arr.retainAll(arr1);
	System.out.println(arr);
	
 System.out.println(arr.equals(arr1));
  
 
   
	
	
	
	
	
	
		
		
     
	}
}

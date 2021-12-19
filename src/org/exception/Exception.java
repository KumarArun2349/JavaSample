package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exception {
public static void main(String[] args) {
	/*System.out.println(4/0);
	java.lang.ArithmeticException*/
	try {
		System.out.println(4/0);
	} catch (ArithmeticException e) {
		System.out.println("Don't Divide by Zero");
	}
	
	/*Set<Integer> s = new TreeSet<>();
	java.lang.ClassCastException
	
	
	s.add(null);
	java.lang.NullPointerException
	System.out.println(s);*/
	
	int a[] =new int[2];
	a[0]=10;a[1]=20;
	/*System.out.println(a[2]);
	java.lang.ArrayIndexOutOfBoundsException*/
	
	try {
		System.out.println(a[2]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("a[2]");
	}
	
	String s="abc";

	/*System.out.println(charAt);
	java.lang.StringIndexOutOfBoundsException*/
	try {
		char charAt = s.charAt(3);
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("charAt(3)");
	}
	
	Scanner s1 = new Scanner(System.in);
	
	/*System.out.println(nextInt); --->1213a(AlphaNumeric)
	java.util.InputMismatchException*/
	try {
		int nextInt = s1.nextInt();
	} catch (InputMismatchException e) {
		System.out.println("Input Mismatch Exception Handled");
	}
	
	String s2= "123abc";
	/*System.out.println(s);
	java.lang.NumberFormatException*/
	
	try {
		int parseInt = Integer.parseInt(s2);
	} catch (NumberFormatException e) {
		System.out.println("Number Format Exception Handled");
	}
	
	List li = new ArrayList();
	li.add("Arun");
	li.add('K');
	
	//java.lang.IndexOutOfBoundsException
	
	try {
		System.out.println(li.get(2));
	} catch (IndexOutOfBoundsException e) {
		System.out.println("Index OutOf Bounds Exception Handled");
	}
	
}
}


/*try {
	System.out.println(4/0);
} catch (ArithmeticException e) {
	System.out.println("Do not divide a number");
}*/
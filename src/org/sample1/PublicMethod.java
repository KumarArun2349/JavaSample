package org.sample1;

import org.sample.PrivateMethod;
import org.sample2.ProtectedMethod;

public class PublicMethod extends ProtectedMethod{

	public void publicOne() {
	System.out.println("Public Modifier");	
	}
	public static void main(String[] args) {
		PublicMethod p = new PublicMethod();
		p.publicOne();
		p.protectedMethod();
		
		
	}
}
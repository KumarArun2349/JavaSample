package org.sample2;

public class ProtectedMethod {
	protected void protectedMethod() {
		System.out.println("Protected Modifier");

	}
	public static void main(String[] args) {
		ProtectedMethod pro = new ProtectedMethod();
		pro.protectedMethod();
	}
}

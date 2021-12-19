package org.exception;

import java.io.FileNotFoundException;

public class Exception1 {
	public static void main(String[] args) {

		try {
			System.out.println(4 / 0);
		}  catch (NullPointerException e) {

		} catch (StringIndexOutOfBoundsException e) {

		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (IndexOutOfBoundsException e) {

		}catch (ArithmeticException e) {
			System.out.println("Exception Handled");
		}

	}
}

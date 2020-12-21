package exceptionHandling;

public class Test1 {
public static void main(String[] args) {
	try {
		int[] arr= {10,20,30,40};
		System.out.println(arr[6]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("handling the exception");
	}
	
	try {
	int i=1/0;
	}
	catch(ArithmeticException a) {
	System.out.println("handled");
	}

}}

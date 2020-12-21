package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {

	public static void main(String[] args)  {
		try {
		FileInputStream f=new FileInputStream("./d");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Handled AIOexp");
		}
		catch(FileNotFoundException a) {
			System.out.println("handled Nexp");
		}
		
	}

}

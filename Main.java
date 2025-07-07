package StudentProject;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConsole sc = new StudentConsole();
		try {
			sc.start();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e); 
		}
	}

}

package demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*String line; 
		int i;
		
		line = sc.nextLine();
		i = sc.nextInt();
		
		System.out.println(line);
		System.out.println(i);*/
		
		for(;;) {
			String line;
			line=sc.nextLine();
			
			if (line.equals("quit")) {
				break;
			}
			System.out.println(line);
		}
	}

}

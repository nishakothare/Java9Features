package TryWithResource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TryResource {
	public static void main(String[] args) throws IOException
	{
		InputStream inptStrm=new FileInputStream("C:\\project\\Java9Features\\src\\test.txt");
		Scanner scan=new Scanner(inptStrm);
		
		try (inptStrm;scan ){
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}

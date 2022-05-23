import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataFromCSVF_ile {

	public static void main(String[] args) throws IOException {
		File f= new File("../Project_1/TestTextData.txt");
		//	Read Data
		//FileReader fr= new FileReader(f);

		/* 
		 * Character by character data read	
	 	int a;

		while((a=fr.read())!= -1)
		{
			System.out.println((char)a);
		}
		 */

		/*	//Line by line data read

		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		 */

		//write data
		// FileWriter fw= new FileWriter("../Project_1/TestTextData.txt");
		/* fw.write("New Line added and overriden in exiting file");
		fw.close(); // compulsion for saving and closing the file
		 */

		//we'll use bufferwriter class to move cursor to the next line
		
		//append line
		FileWriter fw= new FileWriter(f, true);

		BufferedWriter bw= new BufferedWriter(fw);
		bw.newLine();
		bw.write("5th written or overriden line");
		bw.newLine();
		bw.write("last append line");
		bw.close(); // compulsion for saving and closing the file
	}
}

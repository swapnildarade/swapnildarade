package Filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Filecreate {

	public void create1() throws IOException
	{
		File f=new File("D:\\new2.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is already Exist");
		}
		
		FileWriter w=new FileWriter(f);
		w.write(" Welcome  swapnil");
		w.close();
	}
	
	public void create2() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("D:\\new1.txt",true);
		String name="my name is Swapnil";
		byte arr[]=name.getBytes();
		fo.write(arr);
		System.out.println("Data Written");
		fo.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Filecreate f1=new Filecreate();
		f1.create1();
		
		f1.create2();

	}

}

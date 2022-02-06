package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Fileread {

	public static void readFileFileInputStream() throws IOException
	{
		
		FileInputStream stream= new FileInputStream("D:\\new2.txt");
		int data;
		while((data=stream.read())!=-1)
		{
			System.out.print((char)data);
		}
		System.out.println("");
	}

	public static void readDataUsingNIO() throws IOException
	{
		List<String> list= Collections.emptyList();
		Path path= Paths.get("D:\\new1.txt");
		list= Files.readAllLines(path,StandardCharsets.UTF_8);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) throws IOException {
		
		Fileread f=new Fileread();
		Fileread.readFileFileInputStream();
		f.readDataUsingNIO();

	}

}

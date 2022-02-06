package Filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filedelete 
{

	public static void main(String[] args) throws IOException,NoSuchFileException
{
	

	Path path= Paths.get("D:\\new.txt");
	if(Files.deleteIfExists(path))
		System.out.println("File deleted");
	else
		System.out.println("file not deleted");
	}

}
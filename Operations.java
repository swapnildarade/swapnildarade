package AllFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

 class Operations {




	private static final String String = null;
	private static final File File = null;


	public  static void msg() throws IOException 
	{
		 System.out.println("\n**************************************\n");
	        System.out.println("\tLockers Pvt. Ltd.\n");
	        System.out.println("\tDeveloped By Swapnil.");
	        System.out.println("**************************************");
	        System.out.println("1.ListFile\n2.Crate File\n3.Delete File\n4.Search File\n5.close");
	        Scanner sc =new Scanner(System.in);
			int b=sc.nextInt();
	       
	        do {
	        switch(b)
	        {
	        
	        	
	        case 1: listfile();
	        		msg();
	        break;
	        
	        case 2: createfile();
	        		msg();
    		break;
	        case 3: deletefile(null);
	        		msg();
	        break;
	        case 4: searchfile(String, File);
	        		msg();
	        break;
	        
	        case 5: Close();
	        break;
	        
	        }
	        }
	        while(b!=5);
	        
	        
	        
	}
	        
	        	
	        
	
	
	public static  void listfile() 
	{
	
		 File dir = new File("C:\\Users\\swapn\\OneDrive\\Desktop\\java project");
	      String[] files = dir.list();
	    
	      if (files == null) 
	      {
	          System.out.println("does not exist or is not a directory");
	       } 
	      else
	      {
	          for (int i = 0; i < files.length; i++) 
	          {
	             String filename = files[i];
	             System.out.println(filename);
	          }
	       }
	      
	}
	
	public static void createfile() 
	{
		
		System.out.print("Please enter an output file: ");
		Scanner sc = new Scanner(System.in);
		 String f=sc.nextLine();
         File file=new File("C:\\Users\\swapn\\OneDrive\\Desktop\\java project\\"+f+".txt");
         try {
			if(file.createNewFile())
			 {
			     System.out.println("File is created");
			 }
			 else
			 {
			     System.out.println("File is already Exist");
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		        
		    
	}
	
	public static void deletefile(File file)  
	{
		
		System.out.println("Enter the file name");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		String path="C:\\Users\\swapn\\OneDrive\\Desktop\\java project";
		File fileToDelete= new File("C:\\Users\\swapn\\OneDrive\\Desktop\\java project\\"+a+".txt");
		if(fileToDelete.delete()){
		  System.out.println("File deleted");
		} else {
		  System.out.println("failed");
		}
		
		
	}
	 public static void Close() 
	 {
	        System.out.println("Closing your application... \nThank you!");
	     System.exit(0);
	 }
	
	public static void searchfile( String name,File file) throws NullPointerException, FileNotFoundException 
	{
		System.out.println("Enter File name which you want to search");
		
		Scanner sc=new Scanner(System.in);
		String g=sc.next();
		
		String path="C:\\Users\\swapn\\OneDrive\\Desktop\\java project\\"+g+".txt";
		File myFile = new File(path);
		if (myFile.exists()) {
			System.out.println(myFile.getName() + " exists");
			
		}
		else
		{
			System.out.println("not Found");
		}
		
		}
	
	
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
	Operations op=new Operations();
	op.msg();
	
	}

}

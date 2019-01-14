package com.day09;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class File_Ex {

	public static void main(String args[]) throws IOException
	{
		//folder_file();
		//filelist();
		filereaderwriter();
	}
	public static void folder_file() throws IOException
	{
		File odir = new File("D:\\Games\\newfolder");
		
		if(odir.exists())
		{
			System.out.println("Folder already exists");
		}
		
		else {
			System.out.println("Folder doesn't exist. Hence, creating the new folder");
			odir.mkdirs();
		}
				
		File ofile = new File(odir,"newfile.txt");
		
		if(ofile.exists())
		{
			System.out.println("file already exists");
			
		}
		else
		{
			System.out.println("file doen't exist. hence, creating the file");
			ofile.createNewFile();
			
		}
	
		
}
	
	public static void filelist()
	{
		File odir1 = new File("C:\\Users\\admin\\Downloads");
		
		String flist[] = odir1.list();
		
		int icount = 0;
		
		for(int i=0;i<flist.length;i++)
		{
			//System.out.println(flist[i]);
			
			if(flist[i].contains("java"))
			{
				icount++;
			}
		}
		System.out.println("The number of .java files in the folder downloads is :"+icount);
		
		int jcount = 0;
		
		for(int i=0;i<flist.length;i++)
		{
			if(flist[i].contains("pdf"))
			{
				jcount++;
			}
		}
		System.out.println("The number of .pdf files in the folder downloads is: "+jcount);
	}
	
	public static void filereaderwriter() throws IOException
	{
File odir = new File("D:\\Games\\newfolder");
		
		if(odir.exists())
		{
			System.out.println("Folder already exists");
		}
		
		else {
			System.out.println("Folder doesn't exist. Hence, creating the new folder");
			odir.mkdirs();
		}
				
		File ofile = new File(odir,"Filereaderwriter.txt");
		
		if(ofile.exists())
		{
			System.out.println("file already exists");
			
		}
		else
		{
			System.out.println("file doen't exist. hence, creating the file");
			ofile.createNewFile();
			
		}
	 
		FileWriter owrite = new FileWriter(ofile, true);
		owrite.write("this is a java prog");
		owrite.write("Followed By Selenium Session\n");
		owrite.write(65);
		owrite.flush();
		owrite.close();
		
		FileReader oread = new FileReader(ofile);
		int iread = oread.read();
		
		while(iread!=-1) {
			
			System.out.print((char)iread);
			iread = oread.read();
		}
		
		oread.close();
	}
}

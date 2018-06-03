package examples;

import java.io.File;

public class ListFilesInDirectory {

	public static void main(String[] args) {
		File dir = new File("c:/Windows");
		// get a listening of all file in c:/windows
		if(dir.exists())
		{
			File[] array = dir.listFiles();
			//use for each or enhanced for
			for(File f : array) 
			{
				System.out.println(f.getName());
				
			}
		}
		else
		{
			System.out.println("Directory does not exist");
		}
		

	}

}

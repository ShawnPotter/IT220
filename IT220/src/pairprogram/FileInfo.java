//Pair Programming
//Shawn Potter, Rizwan Ali

package pairprogram;

import java.io.File;

public class FileInfo {
	
	private void printPermissions(String path)
	{	
		String result = "Permissions: ";
		File file = new File(path);
		if(file.isFile())
		{
			if (file.canRead())
			{
				result = result +"r";
			}
			if (file.canWrite())
			{
				result = result +"w";
			}
			if (file.canExecute())
			{
				result = result +"x";
			}

			//Check to see if file exists
			if(file.exists())
			{
				System.out.println("File Attributes");
				System.out.println("****************");
				System.out.println("Name: "+file.getName());
				System.out.println("Path from root: "+file.getParentFile());
				System.out.println("Length in bytes: "+file.length());
				System.out.println(result);			
			}
		}
		//get a listing of files in the directory
		if(file.isDirectory())
		{
			System.out.println("Directory Name: "+file.getName()+" (dir)");
			System.out.println("Directory Contents:");
			File[] array = file.listFiles();
			for(File f : array) 
			{
				if(f.isFile())
				{
					System.out.println(f.getName());
				}
				if(f.isDirectory())
				{
					System.out.println(f.getName()+" (dir)");
				}
				if(f.isHidden())
				{
					System.out.println(f.getName()+" (hidden)");
				}
			}
		}
		if(!file.exists())
		{
			System.out.println("No such file or folder exists");
		}
	}
	public void printFileStats(String path)
	{
		printPermissions(path);
	}
}

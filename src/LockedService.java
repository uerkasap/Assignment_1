
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class LockedService {

	public void ListAllFiles(){
		String path = System.getProperty("user.dir");
		File files = new File(path);
		String[] dirListing = null;
		dirListing = files.list();
		Arrays.sort(dirListing);
		System.out.println(Arrays.deepToString(dirListing));
//		for(File f:files.listFiles())
//		{
//			System.out.println(f.getName());
//			System.out.println(f.isDirectory());
//		}	
	}
	
	public void AddFile(String fname) throws IOException{
		
	
	String add_path = System.getProperty("user.dir");	
	File file = new File(add_path, fname);
	

		if(file.exists())
		throw new IOException("The file already exists");
		else
		file.createNewFile();
		System.out.println(file.getName() + " is created!");
	//String finalpath = add_path + "\\" + fname;
	//System.out.println(finalpath + " is added");
	}
	
	public void DeleteFile(String fname) throws FileNotFoundException{
	//case-sensitivity
	
	String del_path = System.getProperty("user.dir");
	File file = new File(del_path, fname);
	

			if(file.exists())
			{file.getName();
			file.delete();
			System.out.println(file.getName() + " is deleted!");
			}
			else
			{
			//System.out.println("The file not found");
			throw new FileNotFoundException("The File not found.");
			}
	}
	

	public void SearchFile(String sv){
	String search_path = System.getProperty("user.dir");	
	File files = new File(search_path);
	String[] dirListing = null;
	dirListing = files.list();
	Arrays.sort(dirListing);
	System.out.println(Arrays.deepToString(dirListing));
		
		boolean found = false;
		for (int i = 0; i < dirListing.length; i++) {
			//System.out.println(dirListing[i]);
			if(dirListing[i].toString().equals(sv))
			{
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(sv + " is found!");
		else
			System.out.println(sv +" is not found!");	
	}
	
}

//Directory not exist exception(DNE)
//Directory not empty exception(DEE)
//File not found exception(FNF) (built-in)
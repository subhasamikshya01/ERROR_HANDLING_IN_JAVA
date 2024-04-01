import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class FileNotFoundException extends Exception{
	public FileNotFoundException(String message) {
		super(message);
	}
}

class FileReadPermissionException extends Exception{
	public FileReadPermissionException(String message) {
		super(message);
	}
}

public class Q4 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Usage: java ReadFile <file_path>");
			return;
		}
		
		String filePath=args[0];
		
		try {
			readFileContents(filePath);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found: "+e.getMessage());
		}
		catch(FileReadPermissionException e) {
			System.out.println("Cannot read file due to permission issues: "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Error reading file: "+e.getMessage());
		}
	}
	
	public static void readFileContents(String filePath)throws FileNotFoundException,FileReadPermissionException,IOException{
		if(filePath==null) {
			throw new FileNotFoundException("File path is null");
		}
		
		java.io.File file=new java.io.File(filePath);
		
		if(!file.exists()) {
			throw new FileNotFoundException("File does not exist");
		}
		
		if(!file.canRead()) {
			throw new FileReadPermissionException("Permission denied to read file");
		}
		
		BufferedReader reader=null;
		
		try {
			reader=new BufferedReader(new FileReader(file));
			String line;
			System.out.println("Contents of the file:");
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}
		finally {
			if(reader!=null) {
				try {
					reader.close();
				}
				catch(IOException e) {
					System.out.println("Error closing file reader: "+e.getMessage());;
				}
			}
		}
	}
}

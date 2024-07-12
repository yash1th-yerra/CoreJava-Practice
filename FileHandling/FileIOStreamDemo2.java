// Java Program to create new file
// using FileOutputStream class

// Importing File Classes
import java.io.FileOutputStream;

// Importing BufferedReader Class for taking input
import java.io.BufferedReader;

// Importing as it converts bits to strings
import java.io.InputStreamReader;

// Function Helping Create New File
public class FileIOStreamDemo2 {

	// Main Driver Method
	public static void main(String args[])
	{
		// Creating File Object
		FileIOStreamDemo gfg = new FileIOStreamDemo();
		gfg.newFile();
	}

	// Function To Create A New File
	public void newFile()
	{
		String strFilePath = "", strFileName = "";
		String filename = "";
		String text ="Hello welcome !";
        FileOutputStream fos = null;

		// Try-Catch Block
		try {

			// Creating BufferClass Object
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

			// Asking file name from User
			strFileName = br.readLine();
			System.out.println("Enter the file path:");

			// Asking file path from User
			strFilePath = br.readLine();
			filename = strFilePath + "" + strFileName + ".txt";

			// Creating Object of FileOutputStream Class
			fos = new FileOutputStream(filename);
			byte[] strtoBytes = text.getBytes();
            fos.write(strtoBytes);
            System.out.println("File is Created with content Succesfully");

		}

		// Try-Catch Block
		catch (Exception e) {
			e.printStackTrace();
		}
        finally{
            try{
                if(fos!=null)
                fos.close();
            }
        
            catch(Exception e){
                e.getMessage();
            }
        }
		
	}
}

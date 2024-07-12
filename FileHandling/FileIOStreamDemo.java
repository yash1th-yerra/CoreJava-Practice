// Java Program to create new file
// using FileOutputStream class

// Importing File Classes
import java.io.FileOutputStream;

// Importing BufferedReader Class for taking input
import java.io.BufferedReader;

// Importing as it converts bits to strings
import java.io.InputStreamReader;

// Function Helping Create New File
public class FileIOStreamDemo {

	// Main Driver Method
	public static void main(String args[])
	{
		// Creating File Object
		FileIOStreamDemo gfg = new FileIOStreamDemo();
		String filename = gfg.newFile();
		gfg.writeData(filename);
	}


	// Function to Write data into CreatedFile
	public void writeData(String filename){
		String text ="Hello welcome !";
        FileOutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream(filename);
            byte[] strtoBytes = text.getBytes();
            outputStream.write(strtoBytes);
            System.out.println("File is Created with content Succesfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(outputStream!= null){
                try{
                    outputStream.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
	}

	// Function To Create A New File
	public String newFile()
	{
		String strFilePath = "", strFileName = "";
		String filename = "";

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
			FileOutputStream fos = new FileOutputStream(
				filename);
			fos.close();


		}

		// Try-Catch Block
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return filename;
	}
}

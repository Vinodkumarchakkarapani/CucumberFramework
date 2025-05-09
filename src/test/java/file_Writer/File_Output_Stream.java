package file_Writer;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File_Output_Stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="usingfileoutputwriter.txt";
		 String content="java is an object oriented programming language";
		 FileOutputStream file=new FileOutputStream(location);
		byte[] arr= content.getBytes();
		 file.write(arr);
		 file.close();
	}

}

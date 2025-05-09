package file_Writer;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
 
	public static void main(String[] args) throws IOException {
		 String location="usingfilewriter.txt";
		 String content="java is an object oriented programming language";
	FileWriter file=new FileWriter(location);
	file.write(content);
	file.close();
	}
}

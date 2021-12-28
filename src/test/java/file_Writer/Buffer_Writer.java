package file_Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String location="usingBufferedwriter.txt";
		 String content="java is an object oriented programming language";
		 FileWriter file=new FileWriter(location);
		 BufferedWriter buff=new BufferedWriter(file);
		 buff.write(content);
		 buff.close();
	
	}

}



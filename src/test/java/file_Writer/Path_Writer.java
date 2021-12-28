package file_Writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Path_Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="usingpathwriter.txt";
		 String content="java is an object oriented programming language";
		Path path=Paths.get(location);
		Files.write(path,content.getBytes());
	}

}

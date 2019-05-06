package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datafromproperty {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties f = new Properties();
		f.load(new FileInputStream("./abc.properties"));
		String s = f.getProperty("url");
		System.out.println(s);
	}

}

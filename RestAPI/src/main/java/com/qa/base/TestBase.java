package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;

	
public TestBase() throws IOException {
	prop = new Properties();
	FileInputStream File = new FileInputStream("C:\\Users\\pranjal\\eclipse-workspace\\RestAPI\\src\\main\\java\\com\\qa\\config\\config.properties");
	prop.load(File);
	
}
}

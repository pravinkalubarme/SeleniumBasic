package propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public static void main(String[] args){
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		File f=new File(System.getProperty("user.dir")+"\\Resource\\env.properties");
		try {
		fis= new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}
		
		Properties pro= new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String userName = pro.getProperty("uName");
		System.out.println(userName);
		String password = pro.getProperty("password");
		System.out.println(password);
		
		try {
			 fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pro.setProperty("password", "Pravin@123!");
		try {
			pro.store(fos, "Updated Password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String password1 = pro.getProperty("password");
		System.out.println(password1);
		
	}

}

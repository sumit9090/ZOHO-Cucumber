package zoho.managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Temp {

	public static void main(String[] args)  {
		try {

			Properties prop=new Properties();
			System.out.println(System.getProperty("user.dir"));
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties";
			FileInputStream fs = new FileInputStream(path);
			prop.load(fs);
			System.out.println(prop.getProperty("userid"));		
			System.out.println(prop.getProperty("nextbutton_xp"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

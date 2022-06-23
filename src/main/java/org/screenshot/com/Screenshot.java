package org.screenshot.com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.browser.com.Browser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends Browser {
	public static void screenShot(String test) throws Exception {		//String fileName
		try {
		//Converting WebDriver object to takeScreenshoot
		TakesScreenshot scrShot =((TakesScreenshot)driver); 
		
		//Calling the getScreenshotAs() method to create an image file
		File Src=scrShot.getScreenshotAs(OutputType.FILE);
		
		File dirPath = new File(".\\src\\test\\resources\\ScreenShot");
		int i = dirPath.list().length;
		
		//Giving the location
		String filePath = System.getProperty("user.dir")+"//src//test//resources//ScreenShot//"+test+"Screenshot"+i+1+".png";
																	   
		//Moving image file to new destination
		File Dest=new File(filePath);	 
	
		//copying file at destination
		FileUtils.copyFile(Src, Dest);
		}
		catch(Exception e)
		{
			System.out.println("Screen Capture");
			System.out.println(e);
		}
	}
}

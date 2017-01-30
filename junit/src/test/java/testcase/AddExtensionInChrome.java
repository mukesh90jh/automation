package testcase;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddExtensionInChrome {

	/**
	 * http://chrome-extension-downloader.com/ --to get the extension file
	 */
	public static WebDriver driver=null;
	public static void main(String[] args) {
	
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addExtensions(new File(""));
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities().chrome();
		desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver= new ChromeDriver(desiredCapabilities); 	

	}

}

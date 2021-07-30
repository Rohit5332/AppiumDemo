package RealDeviceTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;


public class CalculatorTest {
	
	
	static AppiumDriver driver;

	public static void main(String[] args) {
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "Moto G (3rd Generation)");
		cap.setCapability("udid", "ZY22247W4C");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("adbExecTimeout", 50000);
		
		
		
//		try {
//			openCalculator();
//		} catch (Exception e) {
//			System.out.println(e.getCause());
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		

	}
//	public static void openCalculator() throws Exception{
//		DesiredCapabilities cap =new DesiredCapabilities();
//		cap.setCapability("deviceName", "Moto G (3rd Generation)");
//		cap.setCapability("udid", "ZY22247W4C");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "6.0.1");
//		cap.setCapability("adbExecTimeout", 50000);
//		
//	//	app package and appActivity
//		
//		cap.setCapability("appPackage", "com.android.calculator2");
//		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
//		
//		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		driver =new AppiumDriver<WebElement>(url,cap);
//		System.out.println("Started..."); 
//		WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
//		WebElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
//		WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
//		WebElement equals =driver.findElement(By.id("com.android.calculator2:id/eq"));
//		//WebElement result = driver.findElement(By.className("android.widget.TextView"));
//		
//		two.click();
//		plus.click();
//		three.click();
//		equals.click();
////		String res= result.getText();
////		System.out.println(res);
//	
//	}

}

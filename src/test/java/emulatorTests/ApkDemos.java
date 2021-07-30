package emulatorTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApkDemos extends AndroidEmulator {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Preference\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
	}

}

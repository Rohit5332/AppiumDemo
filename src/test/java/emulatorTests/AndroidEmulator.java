package emulatorTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidEmulator {

	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException { 

		
//		File appDir =new File("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\appiumTests\\java\\appiumTests");
//		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86_arm");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//		System.out.println(app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"API Demos\"]")).click();
	return driver;
	}

}

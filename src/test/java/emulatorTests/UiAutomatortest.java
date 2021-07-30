package emulatorTests;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatortest extends AndroidEmulator {

	public static void main(String[] args) throws MalformedURLException{
		AndroidDriver<AndroidElement> drivers = capabilities();
		drivers.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElementByAndroidUIAutomator("(attribute=value)");
		drivers.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		to validate clickable feature for all options available in apk demos-> Views
		 System.out.println(drivers.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

}

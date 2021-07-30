package emulatorTests;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingDemo extends AndroidEmulator{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> drivers = capabilities();
		drivers.manage().timeouts().implicitlyWait(2, SECONDS);
		drivers.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
//		appium does not support any method for scrolling  (there is no direct method)
//		than we are going to use android UiScrollable feature (android api code)
		drivers.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
		
	}
}
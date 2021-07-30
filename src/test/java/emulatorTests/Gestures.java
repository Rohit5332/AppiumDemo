package emulatorTests;

import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
/**
 * @author HP
 * using tap gesture and longPress gesture
 */
public class Gestures extends AndroidEmulator{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> drivers = capabilities();
		drivers.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		drivers.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		TouchAction ta =new TouchAction(drivers);
		
		WebElement expandList = drivers.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		ta.tap(tapOptions().withElement(element(expandList))).perform();
		
		drivers.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement longpress =drivers.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		ta.longPress(longPressOptions().withElement(element(longpress)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(drivers.findElementById("android:id/title").isDisplayed());
	}

}

package emulatorTests;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDropDemo extends AndroidEmulator {

	/**
	 * @param args
	 * @throws MalformedURLException Drag and drop gesture is performed using touch
	 *                               action class
	 */
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> drivers = capabilities();
		drivers.manage().timeouts().implicitlyWait(2, SECONDS);
		drivers.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		drivers.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

		TouchAction t = new TouchAction(drivers);
		WebElement source = drivers.findElementsByClassName("android.view.View").get(0);
//	how drag and drop performed-->(	longpress->  move to destination-> release)
		
		WebElement destination = drivers.findElementsByClassName("android.view.View").get(2);

//		t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();

//		we can also write the above line in the format or below line both are correct but good practise is above line 
//		but if we want to add withDuration then we have to use like above format
		
		t.longPress(element(source)).moveTo(element(destination)).release().perform();

	}
}
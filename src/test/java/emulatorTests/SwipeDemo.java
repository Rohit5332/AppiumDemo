package emulatorTests;

import java.net.MalformedURLException;
import java.time.Duration;

//after use of static keyword in import stmt we can import methods name
//of the class and can be used directly.
import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeDemo extends AndroidEmulator {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> drivers = capabilities();
		drivers.manage().timeouts().implicitlyWait(2, SECONDS);

		drivers.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		drivers.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();

		drivers.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		drivers.findElementByXPath("//*[@content-desc='9']").click();

		TouchAction t = new TouchAction(drivers);

		WebElement first = drivers.findElementByXPath("//*[@content-desc='15']");
		WebElement second = drivers.findElementByXPath("//*[@content-desc='45']");

		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(first))
				.withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(second)).release().perform();

	}
}
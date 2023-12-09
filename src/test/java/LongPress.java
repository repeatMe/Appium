import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class LongPress extends BaseTest {

	@Test
	public void longPressGeasture() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	    WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
	   // longPressAction()
		String text=driver.findElement(By.id("android:id/title")).getText();
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed()); 
		assertEquals(text, "Sample Menu");
	
	
	}
}

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
//import java.net.URL;

public class First extends BaseTest{
	
	@Test
	public void appium() throws MalformedURLException {
		
//		AppiumDriverLocalService service=new AppiumServiceBuilder()
//				.withAppiumJS(new File("C://Users//offic//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		 service.start();
//		
//		
//		UiAutomator2Options options=new UiAutomator2Options();
//		options.setDeviceName("Abhishek");
//		options.setApp("C://Users//offic//eclipse-workspace//Appium//src//test//resources//ApiDemos-debug.apk");
//		
//		
//	    AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	    
	    //locators- xpath, id, accessibilityId,classname,androidAutomator
		configureAppium();
	    driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	    
	    
	    //driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. preference dependencies']")).click();	    
	    tearDown();
	    
	    
	  
	
	}

}

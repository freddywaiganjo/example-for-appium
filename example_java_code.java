package com.appium.facebook.android;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestFacebookLogin {
	
	@Test
	public void testFBLogin() throws MalformedURLException{
		File appDir = new File("src");
		File app = new File (appDir,"Facebook.apk");
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion","4.3");
	capabilities.setCapability("deviceName", "Google Nexus 7");
	capabilities.setCapability("appPackage","com.facebook.katana");
	capabilities.setCapability("appActivity","LoginActivity");
	capabilities.setCapability("app", app.getAbsolutePath());
	capabilities.setCapability("noReset",false);
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	
	}
}

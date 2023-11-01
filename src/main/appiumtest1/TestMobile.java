package appiumtest1;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TestMobile {
	
	
	public static void openCalendar() throws Exception  {

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO A5s");
		cap.setCapability("udid", "U8NF8L9DPZOJSOHY");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		
		cap.setCapability("appPackage", "com.google.android.calendar");
		cap.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity-Calendar");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		System.out.println("Somewhere get started");
	} 

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		openCalendar();}catch(Exception exp) {
			exp.printStackTrace();
		}
	}

}

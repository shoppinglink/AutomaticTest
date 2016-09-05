package com.keyi;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class AppTest{
    @BeforeTest
    public void beforeTest() {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "master_v1.3.1.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","192.168.20.102:5555");
        //capabilities.setCapability("udid","192.168.20.101:5555");
        //capabilities.setCapability("deviceName","Android Emulator");
        // capabilities.setCapability("deviceName","021YLJ4C2B020033");
        //capabilities.setCapability("platformVersion", platform_version);
        capabilities.setCapability("platformVersion", "5.0.0");
        capabilities.setCapability("app", app.getAbsolutePath());
        //capabilities.setCapability("unicodeKeyboard", true);
        //capabilities.setCapability("autoLaunch",false);//Appium是否需要自动安装和启动应用。默认值true
        //capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        //capabilities.setCapability("appActivity", ".ContactManager");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void Test() {
    }

    @AfterTest
    public void afterTest() {
    }


}


/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

*//**
 * Unit test for simple App.
 *//*
public class AppTest 
    extends TestCase
{
    *//**
     * Create the test case
     *
     * @param testName name of the test case
     *//*
    public AppTest( String testName )
    {
        super( testName );
    }

    *//**
     * @return the suite of tests being tested
     *//*
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    *//**
     * Rigourous Test :-)
     *//*
    public void testApp()
    {
        assertTrue( true );
    }
}*/

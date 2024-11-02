
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        AppiumDriver driver = null;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "192.168.1.3:5555");
        cap.setCapability("platformName", "android");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        TimeUnit.SECONDS.sleep(2);

        var el1 = driver.findElement(AppiumBy.accessibilityId("8"));
        el1.click();
        var el2 = driver.findElement(AppiumBy.accessibilityId("plus"));
        el2.click();
        var el3 = driver.findElement(AppiumBy.accessibilityId("2"));
        el3.click();
        var el4 = driver.findElement(AppiumBy.accessibilityId("equals"));
        el4.click();


    }
}
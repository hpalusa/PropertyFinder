package TestAutomation.glue;


import TestAutomation.SeleniumConfig.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void Initialize(){
        //Driver driverclass = new Driver();
    	Driver driverclass= new Driver();
        driver = driverclass.Launch("Chrome");

    }

    @After
//    public void Terminate(){
//        driver.close();
//    }
    public void killBrowser(Scenario scenario){
        if (scenario.isFailed()) {
         scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        driver.close();
        driver.quit();
    }
}

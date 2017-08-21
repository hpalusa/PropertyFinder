package TestAutomation.glue;

import TestAutomation.Pages.PFPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BaseStepClass {
    public static WebDriver driver;

    public BaseStepClass(){
        driver = Hooks.driver;
        PageFactory.initElements(driver, PFPage.class);
    }

}

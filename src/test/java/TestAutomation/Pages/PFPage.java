package TestAutomation.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import TestAutomation.glue.Hooks;
import junit.framework.Assert;

public class PFPage {

	public static WebDriver driver;

	public PFPage() {
		driver = Hooks.driver;
	}

	public static void launchurlqa() throws InterruptedException {
		driver.navigate().to("http://propertyfinder.qa");
		Thread.sleep(10000);
	}

	public static void navigation_menu() {

		driver.findElement(By.xpath(".//*[@id='search-form-property']/div[3]/div[2]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='search-form-property']/div[3]/div[2]/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath(".//*[@id='bedroom_group']/div[1]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='bedroom_group']/div[1]/div/div/ul/li[5]")).click();
		driver.findElement(By.xpath(".//*[@id='bedroom_group']/div[2]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='bedroom_group']/div[2]/div/div/ul/li[9]")).click();
		driver.findElement(
				By.xpath("//div[@class='pure-control-group pure-u-1-1 pure-u-sm-1-2 pure-u-md-1-4 pure-push']"))
				.click();
		driver.findElement(By.xpath("//li[@data-value='35']")).click();
		driver.findElement(By.xpath(".//*[@id='search-form-property']/div[3]/div[1]/span/input")).sendKeys("THE PEARL");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	public static void searching() {
		driver.findElement(By.xpath("(//div[@class='ms-parent'])[14]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'high')]")).click();

		List<WebElement> li = driver.findElements(By.xpath("//span[@class='price ']"));
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
			//li.get(i).click();
		}

	}

	public static void launchurlqe() throws InterruptedException {
		driver.navigate().to("http://propertyfinder.ae");
		Thread.sleep(10000);
	}

	public static void search() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='js-find-agent']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Languages')]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Arabic')]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'French')]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//button[@class='submit']")).click();
		String Actual = driver.findElement(By.xpath("//h1[@class='serp-h1']")).getText();
		System.out.println(Actual);
		String[] aa = Actual.split(" ");
		String actaul = aa[0];
		int actual = Integer.parseInt(actaul);
		
		driver.findElement(By.xpath("//span[contains(text(),'Nationality')]")).click();
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("//li[contains(text(),'India')]"));

		WebElement From = driver.findElement(By.xpath("//li[contains(text(),'Afghanistan')]"));
		 
		WebElement To = driver.findElement(By.xpath("//li[contains(text(),'Colombia')]"));
		 
		Actions builder = new Actions(driver);
		 
		Action dragAndDrop = builder.clickAndHold(From)	
		 
		.moveToElement(To)
		 
		.release(To)
		 
		.build();
		 
		dragAndDrop.perform();
		Thread.sleep(5000);
		element.click();
		String Actual1 = driver.findElement(By.xpath("//h1[@class='serp-h1']")).getText();
		System.out.println(Actual1);
		String[] aa1 = Actual1.split(" ");
		String expect = aa1[0];
		int expected = Integer.parseInt(expect);
		if(actual>expected){
			Assert.assertEquals("Actaul is expeted is greater", true);
			
		}
		
	}

	public static void searchgridFullname() throws IOException {
		driver.findElement(By.xpath("//a[@class='js-find-agent']")).click();
		driver.findElement(By.xpath(".//*[@id='find-an-agent']/form/div[2]/div[2]/div[1]/a/div/div[1]/img")).click();
		
		String Name = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[1]/section/div[1]/div[2]/h1")).getText();
		System.out.println("Name " +Name); 	
		
		String Natinality = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[1]/section/div[1]/div[2]/div[2]/div[2]")).getText();
		System.out.println("Natinality "+Natinality);
		
		String Languages = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[1]/section/div[1]/div[2]/div[3]/div[2]")).getText();
		System.out.println("Languages "+Languages);
		
		driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[3]/div/section/div[1]/div[1]/button[1]")).click();
		
		String AboutMe = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[3]/div/section/div[2]/div[1]")).getText();
		System.out.println("AboutMe "+AboutMe);
		
		String CompanyName = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[2]/div/section[2]/div/div[2]/div[1]")).getText();
		System.out.println("CompanyName "+CompanyName);
		
		String Activity = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[1]/section/div[2]/div/div[1]/div[1]/div[2]/a")).getText();
		System.out.println("Active listings "+Activity);
		
		String License = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[1]/section/div[2]/div/div[1]/div[2]/div[2]")).getText();
		System.out.println("License "+License);
		
		String Experience = driver.findElement(By.xpath(".//*[@id='find-an-agent']/div/div[2]/div[1]/section/div[2]/div/div[1]/div[3]/div[2]")).getText();
		System.out.println("Experience "+Experience);
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String sss = System.getProperty("//PropertyFinder//Output//ScreenShots");
		FileUtils.copyFile(scrFile, new File(sss+".png"));
		
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/nav/div[3]/a")).click();
		

		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File(sss+"one.png"));
	}

	
}

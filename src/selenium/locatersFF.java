package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class locatersFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.ie.driver
		
		System.setProperty("webdriver.gecko.driver", "E:\\SWS\\fire\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		//"username"
		/*driver.findElement(By.id("username")).sendKeys("viii");
		driver.findElement(By.id("password")).sendKeys("123ee");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());*/
		
		
//		xpath for email
//		 xpath-:  //input[@id='username'] correct
//		css for pass::
//		1)input#password -- correct
//		2)#password -- correct
//		3)#pw  --incorrect because Pw is not an id attribute value.It was name attribute
//		4)input[id='password']  --correct.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("visu");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("sdas12");
		
//		using Regular expression CSS path for salesforce login button\
//		input[class*='primary']
		driver.findElement(By.cssSelector("input[class*='primary']")).click();
		//Get the login Erron by uising regular Expression Xpath::
		// xpath---  //input[contains(@class,'login')]
		//System.out.println(driver.findElement(By.xpath("input[contains(@class,'Error')]")).getText());
		
		
	}

}

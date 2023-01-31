package tutorialninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialninjacss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pull-left']/following-sibling::div[@id='top-links']/descendant::a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("eafasgf");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("sdfsfas");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("sasadsa@fds.CON");

		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("SAFASF");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("SAFAF");

		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("SAFAF");

		  driver.findElement(By.xpath("//input[@name ='agree']")).click();
			Thread.sleep(2000);

		  driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		  
			Thread.sleep(2000);
			
			WebElement profofvalidation=driver.findElement(By.xpath("//h1[contains(text(),'Your Accountdsf Has Been Created!')]"));
			if (profofvalidation.isDisplayed()) {
				driver.findElement(By.cssSelector("a.btn.btn-primary ")).click();

				
			}

		 

		  driver.findElement(By.xpath("//div[@class='list-group']/child::a[13]")).click();
			Thread.sleep(2000);

		  driver.findElement(By.cssSelector("a.btn.btn-primary ")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[contains(@class, 'list-inline')]//descendant::a[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(@class, 'form-group')]//child::input[@id='input-email']")).sendKeys("sasadsa@fds.CON");
			driver.findElement(By.xpath("//div[contains(@class, 'form-group')]//child::input[@id='input-password']")).sendKeys("SAFAF");
			driver.findElement(By.xpath("//div[contains(@class, 'well')]/descendant::input[3]")).click();
			

			



		
		
	}

}

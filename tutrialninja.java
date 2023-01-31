package tutorialninja;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutrialninja {

	public tutrialninja() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("mohamed");
		driver.findElement(By.id("input-lastname")).sendKeys("bel");
		driver.findElement(By.id("input-email")).sendKeys("belmouden.mo@gmail.com");
		
		driver.findElement(By.id("input-telephone")).sendKeys("0606453411");

		driver.findElement(By.id("input-password")).sendKeys("Belmouden@123");

		driver.findElement(By.id("input-confirm")).sendKeys("Belmouden@123");
		
		driver.findElement(By.name("agree")).click();

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}

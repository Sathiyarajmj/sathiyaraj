package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("ram");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("boy");
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("2233442211");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("FBSS@456");
	WebElement idcol = driver.findElement(By.xpath("//select[@id='day']"));
	Select id = new Select(idcol);
	id.selectByValue("3");
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select a = new Select(month);
	a.selectByValue("7");
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select b = new Select(year);
	id.selectByValue("1999");
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	Thread.sleep(2000);
	driver.close();
	}
}  

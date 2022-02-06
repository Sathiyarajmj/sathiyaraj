package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.className("sectionTabButtonUnselected")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CCMBBAM");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rock");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("boy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anbi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("chen");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("service");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hi i am from chennai");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rdsfgafs@abc.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select b = new Select(state);
		b.selectByValue("AZ");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("We are all humans");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String title = driver.getTitle();
		System.out.println("out put titile is -- " + title);

	}

}

package cucumberProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{
		
WebDriver driver;
	@Given("^user launches the admin portal$")
	public void openChromeBrowser()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://siu-uat.bankjoy.com/admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Sign In - Bankjoy Admin");
	}
	@When("^user enters valid Email and Password for Reseller$")
	public void enterEmailAddAndPassword() {
		driver.findElement(By.cssSelector("#Email")).sendKeys("pratik.bhosale+res1@tudip.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("Test12345!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@And("^click on Remember me and sign in button$")
	public void clickSignIn(){
		driver.findElement(By.cssSelector("#RememberMe")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("^user should login successfully and navigate to home page$")
	public void homePage() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Members - Bankjoy Admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@And("^user should be able to see the Permissions Management text in the page$")
	public void viewPermissionsManagementPage() {
		String Text = driver.findElement(By.xpath("//a[contains(text(),'Permissions Management')]")).getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "Permissions Management");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Permissions Management')]")).click();
	}
	@When("^user clicks on the Permissions Management text$")
	public void clickPermissionsManagementText() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text=driver.findElement(By.cssSelector("h1.page-header")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Permissions Management");
	}
	@And("^user should be able to see the Permissions Management page displayed$")
	public void clickPermissionsManagementPage() {
		WebElement we=driver.findElement(By.xpath("//div[@id=\"tiersTab\"]"));
		String text =we.getText();
		System.out.println(text);
	}
	@Then("^user should be able to see Feature Tiers and Business Roles clickable option$")
	public void last() {
		String text=driver.findElement(By.xpath("//a[contains(text(),'Add Consumer Tier')]")).getText();
		System.out.println(text);
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Add Business Tier')]")).getText();
		System.out.println(text1);
		Assert.assertEquals(text, "Add Consumer Tier");
		Assert.assertEquals(text1, "Add Business Tier");
		driver.quit();
		
	}
}

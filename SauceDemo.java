package webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemo {
	public static void main(String[]agrs) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user"); 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		WebElement ProdectName =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		ProdectName.getText();
		System.out.println("Sauce Labs Fleece Jacket");
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		WebElement PriceElement=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		
		PriceElement.getText();
		System.out.println("49.99");
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		driver.findElement(By.xpath("//a[@class='btn_secondary']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//a[@href='./checkout-step-one.html']")).click();
		driver.findElement(By.xpath("//input[@data-test='firstName']")).sendKeys("bharathi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("");
		driver.findElement(By.id("postal-code")).sendKeys("123576");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		driver.quit();

	}

}

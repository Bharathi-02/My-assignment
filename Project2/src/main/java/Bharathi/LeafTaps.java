package Bharathi;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class LeafTaps {

	private static final By WebEelementdriver = null;
	private static WebElement WebElement;

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		WebElement element = driver.findElement(By.id("username")); 
		element.sendKeys("demo");
		element.clear();
		
		
		element.sendKeys("demosalesmanager");
		
		
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");




				
				String text = driver.findElement(By.tagName("label")).getText();

				System.out.println(text);
				

				driver.findElement(By.className("decorativeSubmit")).click();

				

				driver.findElement(By.partialLinkText("CR")).click();
				driver.findElement(By.partialLinkText("Create Lead")).click();
				driver.findElement(By.partialLinkText("Create Lead")).click();
				WebElement username=driver.findElement(By.id("createLeadForm_companyName"));
				
				
				
			  
				username.sendKeys("bharathi");
				
				username.clear();
				
				username.sendKeys("karthikeyan");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sk");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bharathi");
				 WebElement dropdown= driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
				Select obj=new Select(dropdown);
				obj.selectByValue("Public Relations");
				
	
				
	
				 

	}

}

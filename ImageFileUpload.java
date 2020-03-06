package TestingPackage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImageFileUpload 
{

	public static void main(String[] args) throws IOException,InterruptedException
	{
		//find chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Chrome Webdriver\\chromedriver.exe");
		
		//intialize chrome browser
		WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		
		//launch the Timber website on chrome browser
		driver.get("https://demo.bigtreecms.org/admin/login/");
		
		Thread.sleep(1000);
		
		//Demo user login
		
		WebElement Email = driver.findElement(By.id("user"));
		WebElement Password = driver.findElement(By.id("password"));
		
		Thread.sleep(1000);
		
		WebElement Login = driver.findElement(By.xpath("//*[@type='submit']"));
		Email.sendKeys(" demo@bigtreecms.org "); 
		Password.sendKeys("demo");
		Login.click();
		
		Thread.sleep(1000);
		
		//navigate to add image page
		driver.findElement(By.xpath("//*[@class='files']")).click();		
		driver.findElement(By.xpath("//*[@class='icon_small icon_small_picture']")).click();
		
		Thread.sleep(1000);
		
		//Test Scenario 1 - Invalid .bmp image file upload
		//Manually open windows dialoag box to upload .bmp image
		driver.findElement(By.id("file_manager_dropzone")).click();
		Runtime.getRuntime().exec("E:\\Automation\\AutoIT_Script\\AutoITScript1.exe");
		
		Thread.sleep(1000);
		
		//Test Scenario 2 - Valid .jpg image file upload
		//Manually open windows dialoag box to upload .jpeg image
		driver.findElement(By.id("file_manager_dropzone")).click();	
		Runtime.getRuntime().exec("E:\\Automation\\AutoIT_Script\\AutoITScript2.exe");
		
		Thread.sleep(1000);
		
		//Test Scenario 2 - Valid .gif image file upload
		//Manually open windows dialoag box to upload .gif image
		driver.findElement(By.id("file_manager_dropzone")).click();		
		Runtime.getRuntime().exec("E:\\Automation\\AutoIT_Script\\AutoITScript3.exe");
		
		Thread.sleep(1000);
		
		//Test Scenario 4 - Valid .png image file upload
		//Manually open windows dialoag box to upload .png image
		driver.findElement(By.id("file_manager_dropzone")).click();		
		Runtime.getRuntime().exec("E:\\Automation\\AutoIT_Script\\AutoITScript4.exe");
		
		
		
		driver.close();
		
	}
	

}

package Data_driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.Xls_Reader;

public class DRIVEN {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Venky\\Desktop\\ram.xlsx");
		String username =reader.getCellData("sheet1","USERNAME", 2);
		System.out.println(username);
		String password =reader.getCellData("sheet1","PASSWORD", 2);
		System.out.println(password);
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		String text=driver.findElement(By.xpath("//div[@class='footer']")).getText();
		if(text.equals("© 2005, Mercury Interactive (v. 011003-1.01-058)")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		
	}
	}
}

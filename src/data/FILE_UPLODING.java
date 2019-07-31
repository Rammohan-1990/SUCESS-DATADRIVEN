package data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FILE_UPLODING {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venky\\Downloads\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	       driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	       driver.manage().window().maximize();
         Screen screen =new Screen();
        
         Pattern img1=new Pattern("E:\\sikuli\\add.PNG");
         Pattern img2= new Pattern("E:\\sikuli\\get.PNG");
         Pattern img3= new Pattern("E:\\sikuli\\open.PNG");
         Pattern img4= new Pattern("E:\\sikuli\\save.PNG");
        
         
       
       
       screen.click(img1);
       screen.type(img2, "E:\\sikuli\\IMG_0007.jpg");
       screen.click(img3);
       screen.click(img4);
       
       
       
	}

}

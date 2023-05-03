package sia;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Babbi {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babbi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drier = new ChromeDriver();
		drier.manage().window().maximize();
		drier.get("https://demo.guru99.com/test/guru99home/");
		
		
		
		drier.findElement(By.xpath("//*[@id=\"rt-showcase\"]/div/div[1]/div/div/div/div/div[2]/div/div/iframe")).click();

	}
}

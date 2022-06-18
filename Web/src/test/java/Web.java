

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
        Thread.sleep(5000);
        driver.findElement(By.id("u_0_d_m8")).click(); 
        Thread.sleep(7000);
        driver.quit();
		

	}

}

package testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeP {
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/toggleClass/");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@id='button']")).click();
		
//		driver.navigate().to("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.switchTo().frame(0);
//		
//		Actions act = new Actions(driver);
//		act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),
//		driver.findElement(By.xpath("//div[@id='droppable']"))
//).build().perform();
//		
		
	}

}

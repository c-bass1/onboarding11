package Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excercise8_d {

	
	
	@Test
	public void testExcercise6() {
		 
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		String listElement = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]")).getText();
		
	
		System.out.println(listElement);		
		driver.quit();
	}


}


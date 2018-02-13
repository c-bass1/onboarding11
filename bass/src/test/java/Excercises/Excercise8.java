package Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excercise8 {

	@Test
	public void testExcercise6() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
	 
		
		driver.quit();
	}


}


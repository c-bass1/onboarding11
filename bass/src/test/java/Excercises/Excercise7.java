package Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excercise7 {
	
	@Test
	public void testExcercise6() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.w3schools.com/html/html_forms.asp");
		
		driver.findElement(By.linkText("html_examples.asp")).click();
		
	 
		
		driver.quit();
	}


}

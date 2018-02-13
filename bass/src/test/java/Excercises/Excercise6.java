package Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excercise6 {
	
	@Test
	public void testExcercise6() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dropdown")).click();
		
		try
		listbox.<select id="dropdown">
	      <option value="2">Option 2</option>
	  </select>
		
		catch 
		
		driver.quit();
	}

}

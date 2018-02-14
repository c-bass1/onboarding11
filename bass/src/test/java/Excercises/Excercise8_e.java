package Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excercise8_e {

	
	@Test
	public void testExcercise6() {
		 
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"table1\"]"));
		
		String RNO="";
		for(int i = 0; i+1)
	
		{
			WebElement row = table.findElement(By.xpath("//*[@id=\"table1\"]"));
			if(row.getText().trim().contains(RNO))
			{
				RNO=Integer.toString(i+1);
			}
		}
		System.out.println(RNO);		
		driver.quit();
	}


}


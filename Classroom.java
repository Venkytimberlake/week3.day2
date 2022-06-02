package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Link.html");
		List<WebElement> ram = driver.findElements(By.tagName("a"));
		ram.get(0).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		List<WebElement> ram1 = driver.findElements(By.tagName("a"));
		System.out.println(ram.size());
		System.out.println(ram.get(1).getAttribute("href"));
		driver.close();
	}

}

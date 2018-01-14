package WebElementOper.elementOper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleMouseOver {
	WebDriver driver = null;
	WebDriverWait wait= null;
	
	public void mouseOverEvent()
	{
//System.setProperty("webdriver.chrome.driver","./drivers/win/chromedriver.exe");
	driver = new FirefoxDriver();
	wait= new WebDriverWait(driver,30);
	driver.get("http://toolsqa.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath(".//*[@id='primary-menu']/li[3]/a/span[1]/span/span"));
	//action.moveToElement(ele).perform();
	  
	WebElement ele1 = driver.findElement(By.xpath(".//*[@id='primary-menu']/li[3]/ul/li[1]/a/span[1]"));
	//action.moveToElement(ele1).perform();   
	WebElement ele2 = driver.findElement(By.xpath(".//*[@id='primary-menu']/li[3]/ul/li[1]/ul/li[1]/a/span[1]/span/span"));
	//action.moveToElement(ele2).click().perform();
	
	
	
	action.moveToElement(ele).moveToElement(ele1).moveToElement(ele2).perform();
	ele2.click();
	//driver.close();
	}
	
	@Test
	public void dragAndDropBYEx(){
System.out.println("Welcome to java prgram run");
System.out.println("");
		driver = new FirefoxDriver();
		wait= new WebDriverWait(driver,30);
		driver.get("http://www.jqueryui.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();	
        driver.findElement(By.linkText("Draggable")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
        driver.switchTo().frame(0);
        WebElement source= driver.findElement(By.id("draggable"));
        //WebElement target= driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(source,10,10).build().perform();       
	}

	
	public void dragAndDropEx(){
		driver = new FirefoxDriver();
		wait= new WebDriverWait(driver,30);
		driver.get("http://www.jqueryui.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();	
        driver.findElement(By.linkText("Droppable")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("demo-frame")));
        driver.switchTo().frame(0);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(source,target).build().perform();       
	}
}

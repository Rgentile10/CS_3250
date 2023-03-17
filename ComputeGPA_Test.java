package POTD2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;                 // what does this do?
import org.openqa.selenium.WebDriver;			// did I not need these in my firstSeleniumTest?
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;     // for firefox
import org.openqa.selenium.chrome.ChromeDriver;       // for chrome

class ComputeGPA_Test 
{
   private WebDriver driver;
   private String url = "https://cs3250.appspot.com/calculategpa-bypass.jsp";

   @BeforeEach
   public void setUp() 
   {
//      System.setProperty("webdriver.gecko.driver", "/path/to/your/geckodriver");
//      driver = new FirefoxDriver();
		   
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\genti\\Downloads\\WebDrivers\\chrome_v110\\chromedriver_win32\\chromedriver.exe");   	   
      driver = new ChromeDriver();
      
      driver.get(url);      		   	   
   }

   @AfterEach
   public void teardown()
   { 
      driver.close();   
   }
   
   @Test
   public void test_pageTitle()
   {
      assertEquals(driver.getTitle(), "Grade Calculator");	
   }

 
}
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class calcTest {
  private static WebDriver driver;
  private static String baseUrl;
  private static boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  
  public static void main(String[] args) throws Exception {
	  setUp();
	  testAdd();
	  testSubtract();
	  testMultiply();
	  testDivide();
  }
  @Before
  public static void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Noah\\Desktop\\chromedriver_win32\\chromedriver.exe");	
         driver = new ChromeDriver();
   
    baseUrl = "http://webstrar100.fulton.asu.edu/page1/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
 
  @Test
  public static void testAdd() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.name("num1")).clear();
    driver.findElement(By.name("num1")).sendKeys("5");
    driver.findElement(By.name("num2")).clear();
    driver.findElement(By.name("num2")).sendKeys("5");
    driver.findElement(By.id("addition")).click();
    driver.findElement(By.id("addButton")).click();
    assertEquals("10", driver.findElement(By.name("res")).getAttribute("value"));
  }
  
  @Test
  public static void testSubtract() throws Exception {
	  	driver.get(baseUrl);
	  	driver.findElement(By.name("num1")).clear();
	    driver.findElement(By.name("num1")).sendKeys("5");
	    driver.findElement(By.name("num2")).clear();
	    driver.findElement(By.name("num2")).sendKeys("5");
	    driver.findElement(By.id("substraction")).click();
	    driver.findElement(By.id("addButton")).click();
	    assertEquals("0", driver.findElement(By.name("res")).getAttribute("value"));
  }
  
  @Test
  public static void testMultiply() throws Exception { 
	  	driver.get(baseUrl);
	  	driver.findElement(By.name("num1")).clear();
	    driver.findElement(By.name("num1")).sendKeys("5");
	    driver.findElement(By.name("num2")).clear();
	    driver.findElement(By.name("num2")).sendKeys("5");
	    driver.findElement(By.id("Multiplication")).click();
	    driver.findElement(By.id("addButton")).click();
	    assertEquals("25", driver.findElement(By.name("res")).getAttribute("value"));
  }
  
  @Test
  public static void testDivide() throws Exception { 
	  	driver.get(baseUrl);
	  	driver.findElement(By.name("num1")).clear();
	    driver.findElement(By.name("num1")).sendKeys("5");
	    driver.findElement(By.name("num2")).clear();
	    driver.findElement(By.name("num2")).sendKeys("5");
	    driver.findElement(By.id("Division")).click();
	    driver.findElement(By.id("addButton")).click();
	    assertEquals("1", driver.findElement(By.name("res")).getAttribute("value"));
  }
  

}
package xmlTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xmlTest1 
{
//TestNG XML is file is the config. file which contains execution details(How u want to execute the test)
	WebDriver driver;
	static 
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil Mesta\\Desktop\\TestJava\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@Test
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void HomePage_Text() 
	{
		WebElement Text= driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		if(Text.isDisplayed())
		{
			System.out.println("HomePage Text = Facebook helps you connect and share with the people in your life is showm");
		}
		
		else
		{
			System.out.println("HomePage Text is not shown");
		}
		
	}
	
	@Test
	public void Create_New_Account () 
	{
		WebElement Text= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		if(Text.isDisplayed())
		{
			System.out.println("TC Passed :  Create New Account button is displayed");
		}
		
		else
		{
			System.out.println("TC Failed :  Create New Account button not available in Page");
		}
	}
	
	@Test
	public void Create_a_Page() {
		
		
      WebElement Page= driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		if(Page.isDisplayed())
		{
			System.out.println("TC Passed :  Create a Page LinkedText is displayed");
		}
		
		else
		{
			System.out.println("TC Failed :  Create a Page LinkedText is not available in Page");
		}
		
		String S=Page.getText();
		
		System.out.println("Create_a_Page has a Text" +S);
		
	}
	
	@Test
	public void Invalid_Login_Cred() 
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("draj.shet45@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("invalid");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		WebElement ErrorText = driver.findElement(By.xpath("//div[@class='_9ay7']/text()"));
		
		if(ErrorText.isDisplayed())
		{
			System.out.println("Test case Passed : Correct error message shown");
		}
		
		else
		{
			System.out.println("Test case  Failed : InCorrect error message shown");
		}
		
	}
	
	@Test
	public void Forgot_Password_displayed() 
	{
		WebElement forgotPW = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
	if(forgotPW.isDisplayed())
	{
		System.out.println("Forgotten password? Link is displayed");
	}
	
	else
	{
		System.out.println("Forgotten password? Link not displayed");
	}
		
	}
	
	@Test
	public void Click_Forgot_Password() 
	{
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		WebElement Acc = driver.findElement(By.xpath("//h2[text()='Find Your Account']"));
		
		if(Acc.isDisplayed())
			
		{
			System.out.println("Click on Forgot Password landed on correct Page");
		}
		
		else
		{
			System.out.println("Test Failed : Click on Forgot Password not landed on correct Page");
		}
		
	}
	
	@Test
	public void Create_Account_Button() 
	{
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement CA= driver.findElement(By.xpath("\"//div[text()='Sign Up']\""));
		
		if(CA.isDisplayed())
		{
			System.out.println("TC Passed : Sign Up popup opened");
		}
		else
		{
			System.out.println("TC failed : Sign Up popup not opened");
		}
		
	}
	
	@Test
	public void Close()
	{
		driver.close();
	}
}

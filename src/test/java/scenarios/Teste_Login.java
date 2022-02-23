package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

public class Teste_Login {

	static ChromeDriver driver;

	LoginPage input = new LoginPage(driver);

	@BeforeClass
	public static void beforeClass() {

		driver = setupChromeDriver();
		driver.get("http://master-dev-qa.agileprocess.com.br/admin/login/?next=/admin/");

	}

	@AfterClass
	public static void afterClass() {
		
		driver.quit();
	}	
	
	
	@Test
	public void loginValido() {
		input.FazerLogin();
		
	}

	@Test
	public void FazerLoginInvalido() {
		input.FazerLoginInvalido();
	}
	
	

	public static ChromeDriver setupChromeDriver() {

		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}

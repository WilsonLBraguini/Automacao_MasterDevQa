package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public final String CAMPO_LOGIN = "input[id='id_username']";
	public final String CAMPO_SENHA = "input[name='password']";
	public final String BTN_ACESSAR = "input[value='Acessar']";
	
	

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void FazerLogin() {

		driver.findElement(By.cssSelector(CAMPO_LOGIN)).sendKeys("wilson.braguini");
		driver.findElement(By.cssSelector(CAMPO_SENHA)).sendKeys("123");
		driver.findElement(By.cssSelector(BTN_ACESSAR)).click();

	}

	public void FazerLoginInvalido() {
		driver.findElement(By.cssSelector(CAMPO_LOGIN)).sendKeys("wilson.braguini");
		driver.findElement(By.cssSelector(CAMPO_SENHA)).sendKeys("12345");
		driver.findElement(By.cssSelector(BTN_ACESSAR)).click();

	}

}

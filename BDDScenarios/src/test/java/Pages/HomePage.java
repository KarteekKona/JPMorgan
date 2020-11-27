package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[@class='collapsible']//img[@class='first-logo']")
	private WebElement img_logo;
	
	protected WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoIsDisplayed()
	{
			img_logo.isDisplayed();	
	}

}

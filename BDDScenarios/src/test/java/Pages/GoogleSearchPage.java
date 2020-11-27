package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement txt_search;
	
	protected WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchText(String text)
	{
		txt_search.sendKeys(text);
	}
	
	public void clickEnter()
	{
		txt_search.sendKeys(Keys.ENTER);
	}

}

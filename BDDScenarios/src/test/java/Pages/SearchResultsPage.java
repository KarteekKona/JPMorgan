package Pages;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	
	@FindBy(xpath="//a[@href]/h3/span")
	private List<WebElement> links;
	private WebElement firstLink;
	protected WebDriver driver;
	
	public SearchResultsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFirstLink()
	{
		Iterator<WebElement> iter = links.iterator();
		firstLink = iter.next();
		firstLink.click();
	}
	
}

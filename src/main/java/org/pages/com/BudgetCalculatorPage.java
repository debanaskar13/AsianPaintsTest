package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BudgetCalculatorPage extends Browser {
	
	public BudgetCalculatorPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/form/h3")
	public WebElement carpetAreaLabel;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/form/label")})
	public List<WebElement> typeOfProject;
	
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/form/label")})
	public List<WebElement> selectSpace;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/form/label")})
	public List<WebElement> sizeOfHome;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[1]/input")
	public WebElement carpetAreaInput;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/form/div/div[2]/a")
	public WebElement calculateNowButton;
	
	@FindBys({@FindBy(xpath="//div[@class='slick-slide']")})
	public List<WebElement> products;
	
	public void iterateList(List<WebElement> list,String data) {
		for(WebElement element:list) {
			if(element.getText().equalsIgnoreCase(data)) {
				element.click();
			}
		}
	}
	
}

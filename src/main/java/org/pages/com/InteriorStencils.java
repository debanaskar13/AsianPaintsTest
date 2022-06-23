package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class InteriorStencils extends Browser {
	
	public InteriorStencils() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li[2]/a/span")
	public WebElement nature;
	
	@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li[3]/a/span")
	public WebElement allOver;
	
	@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li[4]/a/span")
	public WebElement boardersAndCeilings;
	
	@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li[5]/a/span")
	public WebElement geometric;
	
	@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li[6]/a/span")
	public WebElement themeBased;
	
	@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li[7]/a/span")
	public WebElement ethnic;
	
	@FindBy(xpath = "//button[@class='btn filter-btn']")
	public WebElement filterByBtn;
	
	@FindBys({@FindBy(xpath = "//div[@class='filter-list']/div")})
	public List<WebElement> numberOfTones;
	
	@FindBy(xpath = "//*[@id='prodListing']/section[2]/div[1]/div/div[2]/div[2]/div[2]/button")
	public WebElement applyBtn;
	
	@FindBys({@FindBy(xpath = "//*[@id='prodListing']/section[2]/div[2]/ul/li")})
	public List<WebElement> products;
	
	@FindBys({@FindBy(xpath = "//*[@id='prodListing']/section[1]/ul/li")})
	public List<WebElement> categoryList;
	
	public void selectCategory(String category) {
		for(WebElement element:categoryList) {
			if(element.getText().equalsIgnoreCase(category.trim())) {
				element.click();
			}
		}
	}
	
	public void selectNumberOfTones(String tones) {
		for(WebElement element:numberOfTones) {
			if(element.getText().equalsIgnoreCase(tones)) {
				element.click();
			}
		}
	}
	
}

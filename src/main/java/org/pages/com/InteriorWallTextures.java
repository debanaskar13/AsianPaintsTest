package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InteriorWallTextures extends Browser {
	
	public InteriorWallTextures() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='btn filter-btn']")
	public WebElement filterByBtn;
	
	@FindBys({@FindBy(xpath = "//button[@class='btn action-btn']")})
	public List<WebElement> filterOptions;
	
	@FindBy(xpath = "//button[@class='btn plp-btn filled']")
	public WebElement applyBtn;
	
	@FindBys({@FindBy(xpath = "//*[@id=\"prodListing\"]/div[2]/div/div")})
	public List<WebElement> products;
	
	public void selectTypeOfTextures(String type) {
		for(WebElement element:filterOptions) {
			if(element.getText().toLowerCase().equals(type.toLowerCase())) {
				element.click();
			}
		}
	}
}

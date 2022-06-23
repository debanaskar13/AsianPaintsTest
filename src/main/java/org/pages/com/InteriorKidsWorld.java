package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class InteriorKidsWorld extends Browser {

	public InteriorKidsWorld() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='prodListing']/ul/li[1]/div/a/span")
	public WebElement moveToFirstProduct;

	@FindBy(xpath = "//*[@id=\"prodListing\"]/div[1]/ul/li[2]/div[1]/a/img")
	public WebElement glowTheme;

	@FindBy(xpath = "//*[@id=\"prodListing\"]/div[1]/ul/li[3]/div[1]/a/img")
	public WebElement ceilingTheme;

	@FindBy(xpath = "//*[@id=\"prodListing\"]/div[1]/ul/li[4]/div[1]/a/img")
	public WebElement chotaBheem;

	@FindBys({ @FindBy(xpath = "//li[@class='js-loadmore-items']") })
	public List<WebElement> products;

	public void checkCategory(String category) {
		switch (category.toLowerCase()) {
			case "glowtheme":
				glowTheme.click();
				break;
			case "ceilingtheme":
				ceilingTheme.click();
				break;
			case "chotabheem":
				chotaBheem.click();
				break;
			default:
				System.out.println("Invalid category");
				break;
		}
	}

}

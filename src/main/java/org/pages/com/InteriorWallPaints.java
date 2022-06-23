package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InteriorWallPaints extends Browser {
	
	public InteriorWallPaints() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn filter-btn']")
	public WebElement moveToFilterBy;
	
	@FindBy(xpath="//*[@id='cookie-popup-id']/div/button")
	public WebElement closeCookies;
	
	@FindBy(xpath="//*[@id='prodListing']/div[1]/div[1]/div/div[2]/div[1]/a/img")
	public WebElement royale;
	
	@FindBy(xpath="//*[@id='prodListing']/div[1]/div[1]/div/div[3]/div[1]/a/img")
	public WebElement apcolite;
	
	@FindBy(xpath="//*[@id='prodListing']/div[1]/div[1]/div/div[4]/div[1]/a/img")
	public WebElement tractor;
	
	@FindBy(xpath="//*[@id=\"prodListing\"]/div[3]/div/div[1]")
	public WebElement moveToProducts;
	
	@FindBys({@FindBy(xpath="//*[@id='prodListing']/div[3]/div/div")})
	public List<WebElement> productList;
	
	public WebElement moveToCategory(String category) {
		WebElement target=null;
		try {
			switch (category.toLowerCase()) {
				case "royale":
					moveCursorTo(royale);
					target = royale;
					break;
				case "apcolite":
					moveCursorTo(apcolite);
					target = apcolite;
					break;
				case "tractor":
					moveCursorTo(tractor);
					target = tractor;
					break;
				default:
					System.out.println("invalid Category");
					break;
			}
		} catch (Exception e) {
			System.out.println("in getCategory Method");
			System.out.println(e);
		}
		return target;
	}
	
}

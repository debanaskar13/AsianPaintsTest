package org.pages.com;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Browser {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='headerNav']/div[1]/ul/li[1]/a[2]/span[1]")
	public WebElement paintsAndTextures;
	
	@FindBy(xpath="//*[@id='Interior']/li[1]/a")
	public WebElement interiorWallPaints;
	
	@FindBy(xpath="//*[@id='Interior']/li[2]/a")
	public WebElement interiorWallTextures;
	
	@FindBy(xpath="//*[@id='Interior']/li[3]/a")
	public WebElement interiorKidsWorld;
	
	@FindBy(xpath="//*[@id='Interior']/li[4]/a")
	public WebElement interiorStencils;
	
	@FindBy(xpath="//*[@id='ColoursTextures']/li[4]/a")
	public WebElement budgetCalculatorLink;
	
	@FindBy(xpath="//*[@id='cookie-popup-id']/div/button")
	public WebElement closeCookies;
	
}

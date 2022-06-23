package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdvancedBudgetCalculator extends Browser {
	
	public AdvancedBudgetCalculator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/h3")
	public WebElement sizeOfHome;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[1]/ul/li[2]/a")
	public WebElement advancedCalculatorLink;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[1]/form/div[1]/div/div[1]/div")})
	public List<WebElement> paintingType; 
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[1]/form/div[2]/div/div[1]/div")})
	public List<WebElement> selectSpace;
	
	@FindBy(xpath = "//input[@id='Width']")
	public WebElement width;
	
	@FindBy(xpath = "//input[@id='Height']")
	public WebElement height;
	
	@FindBy(xpath = "//input[@id='Length']")
	public WebElement length;
	
	@FindBy(xpath = "//input[@id='window']")
	public WebElement window;
	
	@FindBy(xpath = "//input[@id='door']")
	public WebElement door;
	
	@FindBy(xpath = "//input[@name='WALLA']")
	public WebElement wallALink;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/ul/li")})
	public List<WebElement> wallAList;
	
	@FindBy(xpath = "//input[@name='WALLB']")
	public WebElement wallBLink;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/ul/li")})
	public List<WebElement> wallBList;
	
	@FindBy(xpath = "//input[@name='WALLC']")
	public WebElement wallCLink;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/ul/li")})
	public List<WebElement> wallCList;
	
	@FindBy(xpath = "//input[@name='WALLD']")
	public WebElement wallDLink;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[4]/div[1]/ul/li")})
	public List<WebElement> wallDList;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[5]/div/label")
	public WebElement includingCeiling;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div[1]/div")})
	public List<WebElement> paintsType;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div")})
	public List<WebElement> texturesType;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/div[3]/div/div[1]/div")})
	public List<WebElement> wallpaperType;
	
	@FindBys({@FindBy(xpath = "//input[@name='ENQUIRE_VISIT_TIME']")})
	public List<WebElement> productsDropdownList;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div/div[2]/div[1]/ul")})
	public List<WebElement> paintsProductList;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[2]/div[1]/ul")})
	public List<WebElement> texturesProductList;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/div[3]/div/div[2]/div[1]/ul")})
	public List<WebElement> wallpaperProductList;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[3]/div[2]/div[1]/button")
	public WebElement calclulateNowBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[3]/div/h3")
	public WebElement chooseProducts;
	
	@FindBys({@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/div")})
	public List<WebElement> products;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div/div[1]/input")
	public WebElement carpetArea;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div/div[2]/button")
	public WebElement exteriorCalculateNowBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div/div[1]/div")
	public WebElement invalidCarpetAreaMessage;
	
	@FindBy(xpath = "//div[@class='js-recommended-product pull-bottom']/h2")
	public WebElement recomendedProducts;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[1]/div")
	public WebElement invalidWidthStatus;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]/div")
	public WebElement invalidLengthStatus;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[3]/div")
	public WebElement invalidHeightStatus;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div")
	public WebElement invalidWindowStatus;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div")
	public WebElement invalidDoorStatus;
	
	
	public void iterateList(List<WebElement> list,String data) {
		for(WebElement element:list) {
			if(element.getText().toLowerCase().contains(data.toLowerCase())) {
				element.click();
			}
		}
	}
	
}

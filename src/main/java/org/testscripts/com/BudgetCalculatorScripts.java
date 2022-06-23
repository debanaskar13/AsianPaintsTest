package org.testscripts.com;

import org.browser.com.Browser;
import org.excel.com.Excel;
import org.pages.com.BudgetCalculatorPage;
import org.pages.com.HomePage;

public class BudgetCalculatorScripts {
	private HomePage home;
	private BudgetCalculatorPage calculator;
	private Excel excel;
	
	public BudgetCalculatorScripts() throws Exception {
		home = new HomePage();
		calculator = new BudgetCalculatorPage();
		excel = new Excel();
		excel.readExcel(1);
	}
	
	public void openApplication() {
		Browser.getUrl();
		home.implycitWait(3000);
		if (home.closeCookies.isDisplayed()) {
			home.closeCookies.click();
		}
	}
	
	public void hoverOnPaintsAndTexturesLink() {
		home.moveCursorTo(home.paintsAndTextures);
	}
	
	public void clickOnPaintsBudgetCalculator() throws Exception {
		home.budgetCalculatorLink.click();
		home.sleep(3000);
	}
	
	public String selectTypeOfProject() {
		String type = excel.getData(0, 1);
		calculator.moveCursorTo(calculator.carpetAreaLabel);
		calculator.iterateList(calculator.typeOfProject, type);
		return type;
	}
	
	public void selectSpace() {
		String space = excel.getData(1, 1);
		calculator.iterateList(calculator.selectSpace, space);
	}
	
	public void selectSizeOfHome() {
		String homeSize = excel.getData(2, 1);
		calculator.iterateList(calculator.sizeOfHome, homeSize);
	}
	
	public void enterCarpetArea() {
		String carpetArea = excel.getData(3, 1).replace("a", "");
		calculator.carpetAreaInput.sendKeys(carpetArea);
	}
	
	public void clickOnCalculateNowBtn() {
		calculator.calculateNowButton.click();
	}
	
	public boolean verifyResult() {
		int expectedResult = Integer.parseInt(excel.getData(4, 1).replace("a", ""));
		int actualResult = calculator.products.size();
		return actualResult >= expectedResult;
	}
	
	
}

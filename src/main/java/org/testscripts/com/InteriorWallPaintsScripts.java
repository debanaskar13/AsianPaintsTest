package org.testscripts.com;

import org.browser.com.Browser;
import org.excel.com.Excel;
import org.pages.com.HomePage;
import org.pages.com.InteriorWallPaints;

public class InteriorWallPaintsScripts {
	private HomePage home;
	private InteriorWallPaints paints;
	private Excel excel;
	
	public InteriorWallPaintsScripts() throws Exception {
		home = new HomePage();
		paints = new InteriorWallPaints();
		excel = new Excel();
	    excel.readExcel(0);
	}
	
	public void openApplication() throws Exception {
		Browser.getUrl();
		closeCookies();
	}
	
	public void hoverOnPaintsTextures() {
		home.moveCursorTo(home.paintsAndTextures);
	}
	
	public void clickOnWallPaints() {
		home.interiorWallPaints.click();
	}
	
	public void closeCookies() throws Exception {
		if(home.closeCookies.isDisplayed()) {			
			home.closeCookies.click();
		}
	}
	
	public void selectTypeOfPaintsAndClick() throws Exception {
		paints.sleep(2000);
		paints.moveCursorTo(paints.moveToFilterBy);
		paints.moveToCategory(excel.getData(0, 1)).click();
		paints.waitForElement(paints.moveToProducts, 2000);
	}
	
	public boolean verifyResult() throws Exception {
		paints.moveCursorTo(paints.moveToProducts);
		int actualResult = paints.productList.size();
		int expectedResult = Integer.parseInt(excel.getData(1, 1).replace("a",""));
		return actualResult >= expectedResult;
	}
	
	
}

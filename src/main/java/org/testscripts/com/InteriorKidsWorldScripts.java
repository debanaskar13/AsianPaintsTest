package org.testscripts.com;

import org.excel.com.Excel;
import org.pages.com.HomePage;
import org.pages.com.InteriorKidsWorld;

public class InteriorKidsWorldScripts {
	private HomePage home;
	private InteriorKidsWorld kids;
	private Excel excel;
	
	public InteriorKidsWorldScripts() throws Exception {
		home = new HomePage();
		kids = new InteriorKidsWorld();
		excel = new Excel();
		excel.readExcel(0);
	}
	
	public void clickOnKidsWorld() throws Exception {
		home.interiorKidsWorld.click();
		kids.sleep(2000);
	}
	
	public void selectCategory() throws Exception {
		kids.moveCursorTo(kids.moveToFirstProduct);
		kids.sleep(2000);
		String category = excel.getData(4, 1);
		kids.checkCategory(category);
	}
	
	public boolean verifyResult() {
		int expectedResult = Integer.parseInt(excel.getData(5, 1).replace("a", ""));
		int actualResult = kids.products.size();
		return actualResult >= expectedResult;
	}
	
}

package org.testscripts.com;

import org.excel.com.Excel;
import org.pages.com.HomePage;
import org.pages.com.InteriorStencils;

public class InteriorStencilsScripts {
	private HomePage home;
	private InteriorStencils stencils;
	private Excel excel;
	
	public InteriorStencilsScripts() throws Exception {
		home = new HomePage();
		stencils = new InteriorStencils();
		excel = new Excel();
		excel.readExcel(0);
	}
	
	public void clickOnStencilLink() throws Exception {
		home.interiorStencils.click();
		home.sleep(2000);
	}
	
	public void selectStencilsTypeAndClick() throws Exception {
		String category = excel.getData(6, 1);
		stencils.selectCategory(category);
	    stencils.sleep(1000);
	}
	
	public void clickOnFilterByBtn() throws Exception {
		stencils.filterByBtn.click();
	    stencils.sleep(1000);
	}
	
	public void selectAndClickOnTones() {
		String tones = excel.getData(7, 1);
		stencils.selectNumberOfTones(tones);
	}
	
	public void clickOnApplyBtn() throws Exception {
		stencils.applyBtn.click();
		stencils.sleep(1000);
	}
	
	public boolean verifyResult() {
		int expectedResult = Integer.parseInt(excel.getData(8, 1).replace("a", ""));
		int actualResult = stencils.products.size();
		return actualResult >= expectedResult;
	}
	
}

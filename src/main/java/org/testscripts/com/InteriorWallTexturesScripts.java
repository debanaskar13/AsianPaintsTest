package org.testscripts.com;

import org.excel.com.Excel;
import org.pages.com.HomePage;
import org.pages.com.InteriorWallTextures;

public class InteriorWallTexturesScripts {
	private InteriorWallTextures textures;
	private Excel excel;
	private HomePage home;
	
	public InteriorWallTexturesScripts() throws Exception {
		textures = new InteriorWallTextures();
		home = new HomePage();
		excel = new Excel();
		excel.readExcel(0);
	}
	
	public void clickOnWallTextures() throws Exception {
		home.interiorWallTextures.click();
		textures.sleep(2000);
	}
	
	public void clickOnFilterBtn() throws Exception {
		textures.moveCursorTo(textures.filterByBtn);
		textures.sleep(1000);
		textures.filterByBtn.click();
		textures.sleep(1000);
	}
	
	public void selectOption() throws Exception {
		String type = excel.getData(2, 1);
		textures.selectTypeOfTextures(type);
		textures.applyBtn.click();
		textures.moveCursorTo(textures.products.get(1));
		textures.sleep(2000);
	}
	
	public boolean verifyResult() {
		int expectedResult = Integer.parseInt(excel.getData(3, 1).replace("a", ""));
		int actualResult = textures.products.size();
		return expectedResult <= actualResult;
	}
	
}

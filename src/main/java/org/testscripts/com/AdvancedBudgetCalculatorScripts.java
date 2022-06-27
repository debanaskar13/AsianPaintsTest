package org.testscripts.com;

import org.excel.com.Excel;
import org.pages.com.AdvancedBudgetCalculator;

public class AdvancedBudgetCalculatorScripts {
	private AdvancedBudgetCalculator calculator;
	private Excel excel;
	
	public AdvancedBudgetCalculatorScripts() throws Exception {
		calculator = new AdvancedBudgetCalculator();
		excel = new Excel();
		excel.readExcel(2);
	}
	
	public void clickOnAdvancedCalculatorLink() throws InterruptedException {
		calculator.moveCursorTo(calculator.sizeOfHome);
		calculator.advancedCalculatorLink.click();
		Thread.sleep(1000);
	}
	
	public void selectPaintingType() {
		String type = excel.getData(0, 1);
		calculator.iterateList(calculator.paintingType, type);
	}
	
	public void selectSpace() throws Exception {
		calculator.iterateList(calculator.selectSpace, "Interior");
		calculator.moveCursorTo(calculator.wallBLink);
		Thread.sleep(1000);
	}
	
	public void selectNumberOfRooms() {
		
	}
	
	public void enterWidth(String width) {
		calculator.width.sendKeys(width);
		calculator.length.click();
	}
	
	public void enterHeight(String height) {
		calculator.height.sendKeys(height);		
		calculator.window.click();
	}
	
	public void enterLength(String length) {
		calculator.length.sendKeys(length);		
		calculator.height.click();
	}
	
	public void enterWindow(String windows) {
		calculator.window.sendKeys(windows);
		calculator.door.click();
	}
	
	public void enterDoor(String doors) throws Exception {
		calculator.door.sendKeys(doors);		
		calculator.moveCursorTo(calculator.chooseProducts);
		calculator.sleep(1000);
	}
	
	
	public String selectPaintsForWallA() throws Exception {
		String type = excel.getData(1, 1);
		calculator.wallALink.click();
		calculator.sleep(1000);
		calculator.iterateList(calculator.wallAList, type);
//		calculator.sleep(1000);
		return type;
	}
	
	public String selectPaintsForWallB() throws Exception {
		String type = excel.getData(2, 1);
		calculator.wallBLink.click();
		calculator.sleep(1000);
		calculator.iterateList(calculator.wallBList, type);
//		calculator.sleep(1000);
		return type;
	}
	
	public String selectPaintsForWallC() throws Exception {
		String type = excel.getData(3, 1);
		calculator.wallCLink.click();
		calculator.sleep(1000);
		calculator.iterateList(calculator.wallCList, type);
//		calculator.sleep(1000);
		return type;
	}
	
	public String selectPaintsForWallD() throws Exception {
		String type = excel.getData(4, 1);
		calculator.wallDLink.click();
		calculator.sleep(1000);
		calculator.iterateList(calculator.wallDList, type);
//		calculator.sleep(1000);
		return type;
	}
	
	public void clickOnIncludingCeiling(String data) throws Exception {
		
		if (data.equals("True")) {
			calculator.includingCeiling.click();
		}
		calculator.moveCursorTo(calculator.calclulateNowBtn);
		calculator.sleep(1000);
	}
	
	public void choosePaintsTypeAndSelectPaints(boolean isSelectPaints) throws Exception {
		if (isSelectPaints) {
			String type = excel.getData(5, 1);
			String paints = excel.getData(6, 1);
			calculator.iterateList(calculator.paintsType, type);
			calculator.productsDropdownList.get(0).click();
//			calculator.sleep(1000);
			calculator.iterateList(calculator.paintsProductList, paints);
		}
	}
	
	public void chooseTexturesTypeAndSelectTextures(boolean isSelectTextures) throws Exception {
		if (isSelectTextures) {
			String type = excel.getData(7, 1);
			String textures = excel.getData(8, 1);
			calculator.iterateList(calculator.texturesType, type);
			calculator.productsDropdownList.get(1).click();
//			calculator.sleep(1000);
			calculator.iterateList(calculator.texturesProductList, textures);
		}
	}
	
	public void chooseWallpaperTypeAndSelectWallpaper(boolean isSelectWallpaper) throws Exception {
		if (isSelectWallpaper) {
			String type = excel.getData(9, 1);
			String wallpaper = excel.getData(10, 1);
			calculator.iterateList(calculator.wallpaperType, type);
			calculator.productsDropdownList.get(2).click();
//			calculator.sleep(1000);
			calculator.iterateList(calculator.wallpaperProductList, wallpaper);
		}
	}
	
	public void clickOnCalculateNowBtn() {
		calculator.calclulateNowBtn.click();
	}
	
	public boolean verifyResult() {
		try {
			String expectedResult = "Recommended Product";
			String actualResult = calculator.recomendedProducts.getText();
			return actualResult.toLowerCase().contains(expectedResult.toLowerCase());
		} catch (Exception e) {
			 System.out.println("In verifyResult of AdvancedCalculator");
		}
		return false;
	}
	
	public void selectExteriorSpace() {
		calculator.iterateList(calculator.selectSpace, "Exterior");
	}
	
	public void enterCarpetArea(String area) {
		calculator.carpetArea.sendKeys(area);
	}
	
	public void clickOnCalculateNowBtnForExterior() throws Exception {
		calculator.exteriorCalculateNowBtn.click();
		calculator.sleep(2000);
	}
	
	public void selectPaintingType(String type) {
		calculator.iterateList(calculator.paintingType, type);
	}

	public boolean verifyForInvalid(String expResult) {
		String actualResult = calculator.invalidCarpetAreaMessage.getText();
		return actualResult.contains(expResult);
	}
	
	public boolean verifyInvalidWidthResult() {
		String actual = calculator.invalidWidthStatus.getText();
		String expected = "Field should contain only";
		return actual.toLowerCase().contains(expected.toLowerCase());
	}
	
	public boolean verifyInvalidLengthResult() {
		String actual = calculator.invalidLengthStatus.getText();
		String expected = "Field should contain only positive numbers with upto 2 decimals greater than 0";
		return actual.toLowerCase().contains(expected.toLowerCase());
	}
	
	public boolean verifyInvalidHeightResult() {
		String actual = calculator.invalidHeightStatus.getText();
		String expected = "Field should contain only positive numbers with upto 2 decimals greater than 0";
		return actual.toLowerCase().contains(expected.toLowerCase());
	}
	
	
	
	
	
	
	
}
